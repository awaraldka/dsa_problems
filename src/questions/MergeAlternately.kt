package questions

fun mergeAlternately(word1: String, word2: String): String {
    val maxLength = maxOf(word1.length, word2.length)
    var returnValue = ""

    for (i in 0..<maxLength) {
        if (i < word1.length)
            returnValue += word1[i]
        if (i < word2.length)
            returnValue += word2[i]
    }

    return returnValue
}
