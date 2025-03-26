package com.company;
import java.util.Scanner;
public class Not_exercise1 {
    public static void main(String[] args) {
        System.out.println("Percentage of student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Math: ");
        int a = sc.nextInt();
        System.out.println("Chemistry: ");
        int b = sc.nextInt();
        System.out.println("Mechanical Engineering: ");
        int c = sc.nextInt();
        System.out.println("Electronics Engineering");
        int d = sc.nextInt();
        System.out.println("Soft Skill");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        float percentage  = sum*100/350;
        System.out.println("Total Percentage is: ");
        System.out.println(percentage);


    }
}
