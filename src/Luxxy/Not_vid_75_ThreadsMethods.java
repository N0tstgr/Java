package Luxxy;
class MyNewThr1 extends Thread{

    public void run(){
                int i = 0;
        while(true){
            System.out.println("I am a billionaire at the age of 21" );
            try {
                Thread.sleep(5555);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
                 int i = 10;
        while(i<11){
            System.out.println("vikash is great" );
            i++;
        }
    }
}
public class Not_vid_75_ThreadsMethods {
    public static void main(String[] args) {
        MyNewThr1 p1 = new MyNewThr1();
        MyNewThr2 p2 = new MyNewThr2();
        p1.start();
//        try{
//            p1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        p2.start();
    }
}
