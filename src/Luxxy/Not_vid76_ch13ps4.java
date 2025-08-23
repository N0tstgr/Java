package Luxxy;
class MyThread9 extends Thread{
    public void run(){
        try {
            Thread.sleep(600);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Not_vid76_ch13ps4 {
    public static void main(String[] args) throws InterruptedException {
MyThread9 o = new MyThread9();
        System.out.println("this is the Thread after creation "+ o.getState());
o.start();
        System.out.println("this is Thread after start " + o.getState());
        Thread.sleep(99);
        System.out.println("this is the thread after sleep  " + o.getState());
o.join();
        System.out.println("this is the thread after join " + o.getState());
        System.out.println( Thread.currentThread().getState());
    }
}
