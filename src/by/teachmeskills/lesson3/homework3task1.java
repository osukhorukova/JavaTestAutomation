package by.teachmeskills.lesson3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//This program checks if the number you enter is included in the array. In case it is included,
// the program will replace it with "-1"

public class homework3task1 {
    public static void main (String[] args){
        int[] randomArray = new int[]{78, 23, 14, 52, 78, 46};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int numb = scanner.nextInt();
        for (int i=0; i < randomArray.length; i++){
            if (numb == randomArray[i]){
                randomArray[i] = -1;
            }
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
