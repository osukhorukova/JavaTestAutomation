package by.teachmeskills.lesson2;

// This program shows first 10 numbers of the following sequence: "0, -5, -10, -15..."

public class homework2task10 {
    public static void main (String[] args){
        int numb = 0;
        int count = 0;
        do{
            System.out.println(numb);
            numb = numb - 5;
            count++;
        } while (count < 10);
    }
}
