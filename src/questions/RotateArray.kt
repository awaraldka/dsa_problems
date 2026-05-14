package questions

fun rotate(nums: IntArray, k: Int): Unit {
    val n = nums.size
    val steps = k % n
    fun reverse(start: Int, end: Int) {
        var i = start
        var j = end
        while (i < j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
    }
    reverse(0, n - 1)
    reverse(0, steps - 1)
    reverse(steps, n - 1)

}
