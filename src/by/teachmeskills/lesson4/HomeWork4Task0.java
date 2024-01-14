package by.teachmeskills.lesson4;

// This program Creates a 3d array. With the help of cycles, it adds N to every element
// of the array. N is entered by a user.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4Task0 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) { //height
            for (int j = 0; j < array[i].length; j++) { //length
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(10); //width
                }
            }
        }
        for (int l = 0; l < array.length; l++) {
            for (int m = 0; m < array.length; m++) {
                System.out.println(Arrays.toString(array[l][m]));
            }
        }
        System.out.println("---------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to add to every element of the array");
        int numb = scanner.nextInt();

        for (int a = 0; a < array.length; a++) { //height
            for (int b = 0; b < array[a].length; b++) { //length
                for (int c = 0; c < array[a][b].length; c++) {
                    array[a][b][c] += numb; //width
                }
            }
        }
        for (int d = 0; d < array.length; d++) {
            for (int f = 0; f < array.length; f++) {
                System.out.println(Arrays.toString(array[d][f]));
            }
        }
        System.out.println("---------");
    }
}

