package questions

fun findNumbers(nums: IntArray): Int {
    var count = 0
    for (num in nums) {
        if (isNumberEven(num)) {
            count++
        }
    }
    return count
}

fun isNumberEven(num: Int): Boolean {
    return num.toString().toCharArray().size % 2 == 0
}
