package hr.from.tomislav_strelar.zokioid.dictionary

import hr.from.tomislav_strelar.zokioid.model.Addendum
import hr.from.tomislav_strelar.zokioid.model.Gender
import hr.from.tomislav_strelar.zokioid.model.Noun

object Dictionary {
    val monthToAdjective = mapOf(
        1 to "samodeklariran",
        2 to "samodopadn",
        3 to "stupidn",
        4 to "zlosretn",
        5 to "nekonzistentn",
        6 to "wannabe",
        7 to "bitno manje konkretn",
        8 to "neozbiljn",
        9 to "drugorazredn",
        10 to "nasiln",
        11 to "sveprisutn",
        12 to "propal"
    )
    val dayToNoun = mapOf(
        1 to Noun("agitator", Gender.MASCULINE),
        2 to Noun("mediokritet", Gender.MASCULINE),
        3 to Noun("guslar", Gender.MASCULINE),
        4 to Noun("mudroslov", Gender.MASCULINE),
        5 to Noun("druker", Gender.MASCULINE),
        6 to Noun("ništarija", Gender.FEMININE),
        7 to Noun("nježna dušica", Gender.FEMININE),
        8 to Noun("prevoditeljica kabale", Gender.FEMININE),
        9 to Noun("political freeloader", Gender.MASCULINE),
        10 to Noun("\"sedma najutjecajnija feministica na svijetu\"", Gender.FEMININE),
        11 to Noun("arhetipski ljevičar", Gender.MASCULINE),
        12 to Noun("narikača", Gender.FEMININE),
        13 to Noun("fejker", Gender.MASCULINE),
        14 to Noun("tabula rasa", Gender.FEMININE),
        15 to Noun("svjedok optužbe", Gender.MASCULINE),
        16 to Noun("ometač", Gender.MASCULINE),
        17 to Noun("provokator", Gender.MASCULINE),
        18 to Noun("dekor", Gender.MASCULINE),
        19 to Noun("seoski kockar", Gender.MASCULINE),
        20 to Noun("šaka jada", Gender.FEMININE),
        21 to Noun("vojna lekarka", Gender.FEMININE),
        22 to Noun("politička kukavica", Gender.FEMININE),
        23 to Noun("crnokošuljaš", Gender.MASCULINE),
        24 to Noun("USKOK-ov maneken", Gender.MASCULINE),
        25 to Noun("biskup", Gender.MASCULINE),
        26 to Noun("priležnik", Gender.MASCULINE),
        27 to Noun("hromi daba", Gender.MASCULINE),
        28 to Noun("izdavač preludija u fetvu", Gender.MASCULINE),
        29 to Noun("mufljuz", Gender.MASCULINE),
        30 to Noun("konjokradica", Gender.MASCULINE),
        31 to Noun("folirant", Gender.MASCULINE)
    )

    val yearModuloToAddendum = mapOf(
        1 to Addendum("za poslati na promatranje."),
        2 to Addendum("iz zadnjeg utočišta mnogih hulja."),
        3 to Addendum("za razgoliti."),
        4 to Addendum("iz trećeg ešalona."),
        5 to Addendum("s manirima kafanske makljaže."),
        6 to Addendum("%s od elementarne nepogode.", feminine = "gora", masculine = "gori"),
        7 to Addendum("%s iz ovog stanja neće izaći po duhu svetome.", feminine = "koja", masculine = "koji"),
        8 to Addendum("%s su usta puna domoljublja.", feminine = "kojoj", masculine = "kojem"),
        9 to Addendum("na bandwagonu."),
        10 to Addendum("%s inzistira na licemjerju.", feminine = "koja", masculine = "koji"),
        11 to Addendum("sa sandukom opljačkanog zlata i skalpom ko Sandokan."),
        12 to Addendum("%s sva jaja i svu perad drži u istoj košari.", feminine = "koja", masculine = "koji"),
        13 to Addendum("%s u mišju rupu.", feminine = "zavučena", masculine = "zavučen"),
        14 to Addendum("%s jede mrvice s poda.", feminine = "koja", masculine = "koji"),
        15 to Addendum("%s donedavno nije %s tko je, što je ni kojeg je porijekla, ili je %s za udbu.", feminine = arrayOf("koja", "znala", "cinkarila"), masculine = arrayOf("koji", "znao", "cinkario")),
        16 to Addendum("u položaju namagarčenja."),
        17 to Addendum("%s ide loviti King Konga pa na kraju upuca kokoš.", feminine = "koja", masculine = "koji"),
        18 to Addendum("%s kao što se nekad išlo na terafič na Ilidžu.", feminine = "odjevena", masculine = "odjeven"),
        19 to Addendum("%s skakuće oko mene kao vesela vjeverica.", feminine = "koja", masculine = "koji"),
        20 to Addendum("%s luksuzni Mercedesi padaju s neba u dvorište.", feminine = "kojoj", masculine = "kojem")
    )
}

