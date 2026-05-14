package questions

fun majorityElement(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var count = 1
    var lastNumber = nums[0]

    for (i in 1..<nums.size) {
        if (nums[i] == lastNumber) {
            count++
        } else {
            count--
            if (count == 0) {
                lastNumber = nums[i]
                count = 1
            }

        }
    }
    return lastNumber
}
