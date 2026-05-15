package questions

fun myAtoi(s: String): Int {

    if (s.isEmpty()) return 0

    var i = 0
    var sign = 1
    var result = 0

    while (i < s.length && s[i] == ' ') {
        i++
    }

    // 2. Handle sign
    if (i < s.length && (s[i] == '+' || s[i] == '-')) {

        if (s[i] == '-') {
            sign = -1
        }

        i++
    }

    while (i < s.length && s[i].isDigit()) {

        val digit = s[i] - '0'

        // 4. Overflow check
        if (
            result > Int.MAX_VALUE / 10 ||
            (result == Int.MAX_VALUE / 10 &&
                    digit > 7)
        ) {

            return if (sign == 1) {
                Int.MAX_VALUE
            } else {
                Int.MIN_VALUE
            }
        }

        result = result * 10 + digit

        i++
    }

    return result * sign
}