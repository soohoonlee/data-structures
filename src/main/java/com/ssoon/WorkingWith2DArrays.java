package com.ssoon;

import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        var board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        var boardTwo = new char[][]{
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'}
        };

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        System.out.println("Arrays.deepToString(board) = " + Arrays.deepToString(board));
        System.out.println("Arrays.deepToString(boardTwo) = " + Arrays.deepToString(boardTwo));
    }
}
