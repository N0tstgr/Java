package Luxxy;
class MyThread5 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }

    }

}


class MyThread6 extends Thread{
    public void run(){
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
public class Not_vid76_ch13ps2 {
    public static void main(String[] args) {

        MyThread5 j = new MyThread5();
        MyThread6 k = new MyThread6();

        j.start();
        k.start();

    }
}
