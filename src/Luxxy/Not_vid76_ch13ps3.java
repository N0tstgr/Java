package Luxxy;
class MyThread7 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }

    }

}

class MyThread8 extends Thread{
    public void run(){
//        int i
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Not_vid76_ch13ps3 {
    public static void main(String[] args) {

        MyThread5 j = new MyThread5();
        MyThread6 k = new MyThread6();
//        j.setPriority(6);
//        k.setPriority(5);
        System.out.println(j.getPriority());
        System.out.println(k.getPriority());
//        j.start();
//        k.start();
    }
}
