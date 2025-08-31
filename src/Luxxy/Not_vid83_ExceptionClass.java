package Luxxy;
import java.lang.Throwable;
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am to String";
    }

    @Override
    public String getMessage() {
        return " I am getMessage";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){

        return "Age can not be greater than 127";
    }
    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct ";
    }
}
public class Not_vid83_ExceptionClass {
    public static void main(String[] args) {


        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
//        String b = sc.next();
        if (a<9){
            try {
//                throw new MyException();
                throw new ArithmeticException("this is an exception");
            }catch(Exception e){
                System.out.println( e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("yes finishedddddd");

            }
            System.out.println("it's done!");

        }


    }
}
