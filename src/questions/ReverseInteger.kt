package questions

fun reverse(x: Int): Int {
    var num = x.toLong()
    var reversed = 0L

    while (num != 0L) {
        reversed = reversed * 10 + (num % 10)
        num /= 10
    }
    return if (reversed > Int.MAX_VALUE || reversed < Int.MIN_VALUE) 0 else reversed.toString().toInt()

}
