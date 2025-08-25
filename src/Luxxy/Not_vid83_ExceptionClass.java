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


        int a = 9;
        Scanner sc = new Scanner(System.in);
        if (a<99){
            throw new MyException();
        }
    }
}
