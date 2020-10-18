package hr.from.tomislav_strelar.zokioid.model

class Addendum(private val format: String, private val feminine: Array<String>, private val masculine: Array<String>) {
    constructor(format: String, feminine: String, masculine: String) : this(format, arrayOf(feminine), arrayOf(masculine))
    constructor(format: String): this(format, "", "")
    fun getFor(gender: Gender?): String {
        return if (feminine.isEmpty() && masculine.isEmpty()) {
            format
        } else {
            when (gender) {
                Gender.FEMININE -> String.format(format, *feminine)
                Gender.MASCULINE -> String.format(format, *masculine)
                Gender.NONE -> format
                null -> format
            }
        }
    }
}