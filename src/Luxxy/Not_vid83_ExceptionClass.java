package Luxxy;
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){

        return super.toString() + "I am to String";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage";
    }
}
public class Not_vid83_ExceptionClass {
    public static void main(String[] args) {


        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        String b = sc.next();
        if (a<9){
            try {
                throw new MyException();
            }catch(Exception e){
                System.out.println("Integer Exception" + e.getMessage());
            }

        }

        //for String
        if (b.length()<3){
            try {
                throw new MyException();

            }catch(Exception e){
                System.out.println("String Exception"+e.getMessage());
            }
        }
    }
}
