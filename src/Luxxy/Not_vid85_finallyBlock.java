package Luxxy;

public class Not_vid85_finallyBlock {
    public static int greet(){
        try {
            int a = 9;
            int b = 0;
            int c = a/b;
            return c;

        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(" Cleaning up the resources this is the end of the function : ");
        }
        return -1;
    }
    public static void main(String[] args) {
int g = greet();
        System.out.println(g);

        int n = 16;
        int m = 8;
        while(true) {
            try {
                System.out.println(n/m);
            }catch(Exception e){
                System.out.println(e);
                break;
            }finally{
                System.out.println("this is final" + m);
            }
            m--;
        }

try {
    System.out.println(500/10);
}
finally {
    System.out.println("yes this is finally");
}

    }
}
