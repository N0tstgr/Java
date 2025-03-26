package com.company;

public class ch7assnmentFbnccino {
    static int fibonacci(int a) {
        if (a == 1) {
            return 1;
        } else {
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                sum = sum + a;
            }
            return a;
        }
    }
    public static void main(String[] args) {
        int x = 9;
        System.out.println("this is the result of fibonacci numbers " + fibonacci(x));

    }
}
