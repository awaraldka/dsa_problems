package questions

fun convert(s: String, numRows: Int): String {
    if (numRows == 1 || s.length <= numRows) return s
    var rows = Array(numRows) { StringBuilder() }
    var currentRow = 0
    var goingDown = false


    for (ch in s) {
        rows[currentRow].append(ch)
        if (currentRow == 0 || currentRow == numRows - 1) {
            goingDown = !goingDown
        }

        currentRow += if (goingDown) 1 else -1
    }

    var result = StringBuilder()

    for (row in rows) {
        result.append(row)
    }

    return result.toString()
}

