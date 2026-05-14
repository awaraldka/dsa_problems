package questions

import java.util.Arrays

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val array = nums1 + nums2

    return findMedian(array)

}

fun findMedian(arr: IntArray): Double {
    Arrays.sort(arr)
    val n = arr.size

    return if (n % 2 != 0) {
        arr[n / 2].toDouble()
    } else {
        (arr[(n - 1) / 2] + arr[n / 2]).toDouble() / 2.0
    }
}


