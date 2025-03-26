package com.company;

public class Not_ch7_Mthdvid31 {

    static int logic(int x, int y){
//int c;
//c = x + y;
//return c;
        int z;
        if(y==x){
            z = y+x;
        }else{
            z = y-x;
        }
        x = 43;
        return z;
    }
    public static void main(String[] args) {

//        int a = 4;
//        int b = 3;
//        int u;
//        u = logic( a,  b);
        int a1 = 10;
        int b1 = 5;
        int x1;
        //methods invocation using Object creation
//        Not_ch7_Mthdvid31 obj = new Not_ch7_Mthdvid31();
//       x1 = obj.logic(a1, b1);
        x1 = logic(a1, b1);
        System.out.println(a1 + " " + b1);
       int p = 98;
       int q = 9;
       int r;
       r = logic(p, q);

        System.out.println(x1);
    System.out.println(r);

    }



}
