package questions

fun romanToInt(num: String): Int {
    var count = 0
    val keyValue = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )


    val array = num.map { it.toString() }
    for (index in array.indices) {

        val current = keyValue[array[index]]!!
        val next = if (index + 1 < array.size) keyValue[array[index + 1]]!! else 0


        if (current < next) count -= current
        else count += current
    }


    return count
}
