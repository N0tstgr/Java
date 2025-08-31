package Luxxy;

import java.util.Scanner;

public class QuickQuiz82 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 9;
        marks[1] = 87;
        marks[2] = 76;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
        System.out.println("Enter the value of index");

        try {
            int m = sc.nextInt();
            System.out.println("Welcome to video on 82");
            try{
                System.out.println(marks[m]);
                flag = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e) {
            System.out.println("Exception in level 1");
        }
        }
        System.out.println("Thanks for using this program and for your precious time to put in ");

    }
}
