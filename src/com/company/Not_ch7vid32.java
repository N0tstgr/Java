package com.company;

public class Not_ch7vid32 {
    static void foo(){
        System.out.println("Happy 4 am  morning Vikash");
    }
    static void foo (int a ){
        System.out.println("Happy  4 am morning " + a +  " " + "vikash");
    }
    static void foo ( boolean b ){
        System.out.println("Happy a great 4 am morning" + " " + b + " " +"vikash");
    }
    static void foo (int a , int b){
        System.out.println("Happy a great X 1000  4 am morning " + a + " vikash the ");
        System.out.println("Happy a great X 1000  4 am morning " + b + " trillionaire");
    }
    static void change (int b){
        b = 98;
    }
    static void  change2 (int [] arr){
        arr[0] = 78;
    }
    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism");
    }

    public static void main(String[] args) {
//        tellJoke();

        //CAse 1 : changing the Integer
//        int x = 88;
//        change(x);
//        System.out.println("The value of x after running change is   " + x);
//        Case 2
        int [] marks = { 52, 73, 77, 89, 94};
        change2(marks); //reference is passed
        System.out.println("The value of x after running change is  " + marks[0]);

//Method Overloading
        //Arguments are actual
        foo();
        foo(5000);
        foo(true);
        foo(6000, 80000);
    }

}

