package questions

fun nextGreatestLetter(arr: CharArray, target: Char): Char {
    var start = 0
    var end = arr.size - 1

    if (target >= arr[end]) return arr[0]



    while (start <= end) {
        val mid = start + (end - start) / 2

        if (target < arr[mid]) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }

    return arr[start]
}
