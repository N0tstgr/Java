package Luxxy;
import java.util.Scanner;
public class Not_vid82_nestedTryCAtch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 9;
        marks[1] = 87;
        marks[2] = 76;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int m = sc.nextInt();
        try {
            System.out.println("Welcome to video on 82");
            try{
                System.out.println(marks[m]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
