package com.company;
import java.util.Scanner;
public class Not_vid19_ps4ka2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year:");
//        int year = sc.nextInt();
//
//if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
//    System.out.println("This is a leap year" );
//
//
//}else{
//    System.out.println("This is not a leap year" );
//}

//problem 6

Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url of the website");
     String fileName = sc.nextLine();
//    System.out.println(url);
//        String web;
//        String url = "www.google.com";
//       if(url.endsWith(".java")){
//            System.out.println(url.endsWith(".com"));
//     }else if(url.contains(".org")){
//         System.out.println("Organisation website");
//     }else if( url.contains(".in")) {
//           System.out.println("Indian website");
//       }else if(url.endsWith(".net")){
//           System.out.println("Network website");
//        }else if(url.contains(".gov")){
//           System.out.println("Government Website");
//       }else if(url.contains("."))
if(fileName.endsWith(".jpeg")){
    System.out.println("Image file");
}else if(fileName.endsWith(".pdf")){
    System.out.println("PDF Document");
}else if(fileName.endsWith(".mp3")){
    System.out.println("Music player file");
}else  {
            System.out.println("Unknown File Type");
        }
            sc.close();
        }
    }

