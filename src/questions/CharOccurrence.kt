package questions

fun correcterOccurrence(data: ArrayList<String>) {
    val mappedData = mutableMapOf<String, Int>()

    for (i in data.indices) {
        if (mappedData.containsKey(data[i])) {
            mappedData[data[i]] = mappedData.getValue(data[i])+ 1
        }else{
            mappedData[data[i]] = 1
        }
    }

    println(generateString(mappedData))


}

fun generateString(mappedData: MutableMap<String, Int>): String {

    val result = StringBuilder()

    for ((key, value) in mappedData) {

        result.append(value)

        repeat(value) {
            result.append(key)
        }
    }

    return result.toString()
}