package com.company;

public class Not_ch2vid9 {
    public static void main(String[] args) {
// precedence
        int a = 6*5-34/2;
        System.out.println(a);
        /*
        //highest precendence goes to * and / then they are evaluated on the basis of left to right associativity
        =33-34/2
        =33-17
        =13

         */
//        Associativity
        int b = 60/5-34*2;//not due to bodmas rule it is because asssociativity left to right
        /*
        = 12-34*2
        = -56
         */
        System.out.println(b);
    }
}
