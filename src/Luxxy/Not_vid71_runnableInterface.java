package Luxxy;
class MyThreadRun implements Runnable{
    public void run(){
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
        System.out.println("i am vikash trillionaire not a thread1");
    }
}

class MyThreadRun2 implements Runnable{
    public void run(){
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
        System.out.println("i am vikash trillionaire not a thread2");
    }
}
public class Not_vid71_runnableInterface {
    public static void main(String[] args) {

        MyThreadRun bullet1 = new MyThreadRun();
        Thread gun1 = new Thread(bullet1);

        MyThreadRun2 bullet2 = new MyThreadRun2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
