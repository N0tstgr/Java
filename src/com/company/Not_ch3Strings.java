package com.company;
import java.util.Scanner;
public class Not_ch3Strings {
    public static void main(String[] args) {
        String name = "vikash";
        int value = name.length();
        System.out.println(value);


//i don't get this i have to understand this again
//        System.out.println(name.charAt(1));
//        String modifiedName = "vikasasasas";
//        System.out.println(modifiedName.indexOf("as", 4));
//        System.out.println(name.lastIndexOf("as", 1));
//        System.out.println(name.equals("Vikash"));
        System.out.println(name.equalsIgnoreCase("Vikash0"));
        System.out.println("I am escape sequence \n double quote");
    }
}
