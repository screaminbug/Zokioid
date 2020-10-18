package hr.from.tomislav_strelar.zokioid.logic

import hr.from.tomislav_strelar.zokioid.dictionary.Dictionary
import hr.from.tomislav_strelar.zokioid.model.Gender

class Zokifier(private val day: Int, private val month: Int, private val year: Int) {
    fun insult(): String {
        val adjective = Dictionary.monthToAdjective[month]
        val noun = Dictionary.dayToNoun[day]
        val genderizedAdjective = when (noun?.gender) {
            Gender.FEMININE -> adjective + "a"
            Gender.MASCULINE -> adjective + "i"
            Gender.NONE -> adjective
            null -> adjective
        }
        val ending = noun?.content + " " + addendum(noun?.gender, year)
        return if (!adjective.equals("wannabe")) {
            "$genderizedAdjective $ending"
        } else {
            "$adjective $ending"
        }
    }

    fun preabmle(): String {
        return when (Dictionary.dayToNoun[day]?.gender) {
            Gender.FEMININE -> "Ti si jedna "
            Gender.MASCULINE -> "Ti si jedan "
            Gender.NONE -> "Nit' ne znam šta si"
            null -> "Nit' ne znam šta si"
        }
    }

    private fun addendum(gender: Gender?, year: Int): String? {
        val sizeOfAddendum = Dictionary.yearModuloToAddendum.size
        return Dictionary.yearModuloToAddendum[year%sizeOfAddendum+1]?.getFor(gender)
    }
}