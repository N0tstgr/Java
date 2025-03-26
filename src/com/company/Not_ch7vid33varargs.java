package com.company;

public class Not_ch7vid33varargs {
//    static int sum( int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b, int c){
//        return a + b + c;
//    }
//    static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
    static int sum(int x , int ...arr){
//       Available as int [] arr;
        int result = x;
        for( int a: arr){

            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("hi vikash is going to learn varargs");

        System.out.println("The sum of nothing is : " + sum(3));
        System.out.println("the sum of 1 is : " + sum(1 ));
        System.out.println("the sum of  2, 8 , 3, and 9 is : " + sum(2, 8, 3, 9 ));
        System.out.println("the sum of  2, 8 , 3, and 9 is : " + sum(4, 2, 8, 3, 9 ));

    }
}
