package questions

fun hIndex(citations: IntArray): Int {
    val numsData = citations.sortedDescending()
    var steps = 0

    for (i in numsData.indices) {
        if (numsData[i] >= i + 1) {
            steps++

        }


    }

    return steps
}
