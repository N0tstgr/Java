package Luxxy;
class MyThreadRun implements Runnable {
    public void run() {
        int i = 10;
        while(i<18) {
            System.out.println("i am vikash trillionaire not a thread1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 10;
        while(i<15) {
            System.out.println("i am vikash trillionaire not a thread2");
            i++;
        }
    }
}
public class Not_vid71_runnableInterface {
    public static void main(String[] args) {

        MyThreadRun bullet1 = new MyThreadRun();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
