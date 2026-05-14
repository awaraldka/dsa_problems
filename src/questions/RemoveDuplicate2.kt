package questions


//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]

fun removeDuplicatesSecond(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var index = 2
    for (j in 2..<nums.size) {
        if (nums[j] != nums[index - 2]) {
            nums[index] = nums[j]
            index++
        }
    }
    return index

}
