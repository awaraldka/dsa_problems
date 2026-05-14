package questions

fun maxProfitSecond(prices: IntArray): Int {
    if (prices.isEmpty()) return 0

    var minPrice = prices[0]
    var maxProfit = 0
    var total = 0

    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }

        total += maxProfit
        maxProfit = 0
        minPrice = price
    }
    return total
}
