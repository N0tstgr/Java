package com.company;

public class Not_cwh_vid34recursion {
    //        factorial(0) = 1
    //factorial(n) = n *(n-1)* (n-2)..
//            factorial(5) = 5 * 4 * 3  * 2 * 1 = 120
//        factorial(n)  = n * factorial(n-1)
    static int factorial(int n) {
        if( n == 0 || n==1){
            return 1;

        }else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 4; i <= n; i++) {
                product *= i;
            }
            return product;

        }

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("the value if factorial n is " + factorial_iterative(n));
        System.out.println("the value if factorial n is " + factorial(n));
    }
}

