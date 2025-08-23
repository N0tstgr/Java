package Luxxy;
class MyThread3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }

    }

}

class MyThread4 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class Not_vid76_ch13PS {
    public static void main(String[] args) {

        MyThread3 j = new MyThread3();
        MyThread4 k = new MyThread4();

        j.start();
        k.start();

    }
}
