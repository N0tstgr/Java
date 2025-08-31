package Luxxy;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 10;
        System.out.println("Thank you " + this.getName());
        while(true){
            System.out.println("I am a billionaire at the age of 21" +this.getName());
        }
    }
}
public class Not_vid74_ThreadPriorities {
    public static void main(String[] args) {
        //Ready Queue : T1 T2 T3 T4 T5

        MyThr1 t1 = new MyThr1("vikashTheTrillionaire");
        MyThr1 t2 = new MyThr1("luxxy");
        MyThr1 t3 = new MyThr1("Not");
        MyThr1 t4 = new MyThr1("btr");
        MyThr1 t5 = new MyThr1("sign(most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
