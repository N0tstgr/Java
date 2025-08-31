package Luxxy;

public class Not_vid80_tryCatch {
    public static void main(String[] args) {
int a = 7000;
int b = 0;
//Without try
//        int c = a/b;
//with try
try {
    int c = a/b;
    System.out.println("the result is " + c);
}
catch(Exception e){
    System.out.println("We are unable to divide. Reason: ");
    System.out.println(e);
}
        System.out.println("End of the program");
    }
}
