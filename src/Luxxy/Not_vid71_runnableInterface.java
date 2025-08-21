package Luxxy;
class MythreadRun implements Runnable{
    public void run(){
        System.out.println("i am vikashtrillionaire not a thread1");
    }
}

class MythreadRun2 implements Runnable{
    public void run(){
        System.out.println("i am vikashtrillionaire not a thread2");
    }
}
public class Not_vid71_runnableInterface {
    public static void main(String[] args) {
        MythreadRun r1 = new MythreadRun();
        MythreadRun r2 = new MythreadRun();
        r1.start();
        r2.start();
    }
}
