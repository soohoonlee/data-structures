package com.ssoon

fun main() {
    val board = Array(3) { CharArray(3) }
    for (i in 0..2) {
        for (j in 0..2) {
            board[i][j] = '-'
        }
    }

    board[0][0] = 'O'
    board[1][0] = 'O'
    board[2][0] = 'O'

    val boardTwo = arrayOf(
        charArrayOf('O', '-', '-'),
        charArrayOf('O', '-', '-'),
        charArrayOf('O', '-', '-')
    )

    println("Arrays.deepToString(board) = " + board.contentDeepToString())
    println("Arrays.deepToString(board) = " + boardTwo.contentDeepToString())
}