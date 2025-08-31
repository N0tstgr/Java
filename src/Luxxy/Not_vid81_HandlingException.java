package Luxxy;

import java.util.Scanner;

public class Not_vid81_HandlingException {
    public static void main(String[] args) {
int [] marks = new int[5];
marks[0] = 8;
marks[1] = 5;
marks[2] = 3;
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");

int j = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is : " + marks[j]);
            System.out.println("The value of array-value/number is : " + marks[j]/number);
        }catch (ArithmeticException e){
            System.out.println("Arithmeticexception occured!  ");
            System.out.println(e);
        }
        catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!  ");
            System.out.println(e);

        }  catch (Exception e){
            System.out.println("some  other exception occured!  ");
            System.out.println(e);
        }


    }
}
