package Luxxy;

class Mythread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<1000) {
            System.out.println("my  cooking restaurent thread is running");
            System.out.println(" i am happy");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<1000) {
            System.out.println("my thread2 is running for chatting with her ");
            System.out.println(" i am great");
            i++;
        }
    }
}
public class Not_vid70_thread {
    public static void main(String[] args) {
Mythread t1 = new Mythread();
Mythread2 t2 = new Mythread2();
t1.start();
t2.start();
    }
}
