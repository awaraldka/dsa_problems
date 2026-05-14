package questions


//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    var total = 0

    for (row in accounts) {
        for (col in row) {
            total += col
        }
        if (total > max) {
            max = total

        }
        total = 0
    }
    return max
}
