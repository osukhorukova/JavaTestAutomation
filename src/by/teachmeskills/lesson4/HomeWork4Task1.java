package by.teachmeskills.lesson4;

import java.util.Arrays;

// This program "paints" a chessboard in black (B) and white (W) using cycles

public class HomeWork4Task1 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i += 2) {
            for (int j = 0; j < chessboard[i].length; j += 2) {
                chessboard[i][j] = "W";
            }
        }

        for (int i = 1; i < chessboard.length; i += 2) {
            for (int j = 1; j < chessboard[i].length; j += 2) {
                chessboard[i][j] = "W";
            }
        }

        for (int i = 0; i < chessboard.length; i += 2) {
            for (int j = 1; j < chessboard[i].length; j += 2) {
                chessboard[i][j] = "B";
            }
        }

        for (int i = 1; i < chessboard.length; i += 2) {
            for (int j = 0; j < chessboard[i].length; j += 2) {
                chessboard[i][j] = "B";
            }
        }


        for (int l = 0; l < chessboard.length; l++) {
            System.out.println(Arrays.toString(chessboard[l]));
        }
    }
}


