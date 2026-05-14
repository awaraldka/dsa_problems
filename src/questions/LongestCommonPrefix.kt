package questions

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    val shortest = strs.minByOrNull { it.length }!!

    for (i in shortest.indices) {
        val c = shortest[i]
        for (s in strs) {
            if (i > s.length || s[i] != c) {
                return shortest.substring(0, i)
            }
        }
    }
    return shortest

}
