package questions

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var maxWater = 0

    while (left < right) {
        val width = right - left
        val currentHeight = minOf(height[left], height[right])
        val currentArea = width * currentHeight

        maxWater = maxOf(currentArea, maxWater)

        if (height[left] < height[right]) {
            left++
        }else{
            right--
        }
    }
    return maxWater
}