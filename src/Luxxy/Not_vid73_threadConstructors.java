package Luxxy;
class MyThr extends Thread{
    public MyThr(String name){
       super(name);
    }
    public void run(){
        int i = 10;
        while(i<15){
            System.out.println("I am a billionaire at the age of 21");
            i++;
        }
    }
}
public class Not_vid73_threadConstructors {
    public static void main(String[] args) {
MyThr t1 = new MyThr("vikashTheTrillionaire");
MyThr t2 = new MyThr("vikashTheBillionaireAttheageof 21");
t1.start();
t2.start();
        System.out.println("the id of the thread t is " + t1.getId());
        System.out.println("the Name of the thread t is " + t1.getName());

        System.out.println("the id of the thread t is " + t2.getId());
        System.out.println("the Name of the thread t is " + t2.getName());
    }
}
