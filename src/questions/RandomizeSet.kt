package questions


var hashmapData: HashMap<Int, Int> = HashMap()
var listData = mutableListOf<Int>()

fun insert(`val`: Int): Boolean {
    if (hashmapData.contains(`val`)) {
        return false
    }

    hashmapData[`val`] = `val`
    listData.add(`val`)
    return true


}

fun remove(`val`: Int): Boolean {
    if (!hashmapData.contains(`val`)) {
        return false
    }
    hashmapData.remove(`val`)
    listData.remove(`val`)
    return true
}

fun getRandom(): Int {
    return listData.random()
}

