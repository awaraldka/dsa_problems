package questions

fun isPalindrome(n: Int): Boolean {
    if (n < 0 || (n % 10 == 0 && n != 0)) return false

    var x = n
    var rev = 0

    while (x > rev) {
        rev = rev * 10 + x % 10
        x /= 10
    }

    return x == rev || x == rev / 10
}