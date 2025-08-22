package Luxxy;
class MyThreadRun4 implements Runnable {
    public void run() {
        int i = 10;
        while(i<18) {
            System.out.println("i am vikash trillionaire not a thread1");
            i++;
        }
    }
}
class MyThreadRunnable3 implements Runnable{
    public void run(){
        int i = 10;
        while(i<15) {
            System.out.println("i am vikash trillionaire not a thread2");
            i++;
        }
    }
}
public class dummy71 {
    public static void main(String[] args) {

        MyThreadRun4 gun1= new MyThreadRun4();


        MyThreadRunnable3 gun2 = new MyThreadRunnable3();


        gun1.run();
        gun2.run();
    }
}
