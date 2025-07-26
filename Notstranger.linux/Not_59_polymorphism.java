package Notstranger.linux;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Evening");
    }
    default void record4kVideo(){
        greet();
        System.out.println("REcording in 4 k ..");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class MyCellPhone2{
    void CallNumber(int phoneNumber)
    {
        System.out.println("CAlling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }

}
class MySmartPhone2 extends MyCellPhone implements MyWifi2 ,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("TAking video");
    }
    //    public void record4kVideo(){
//        System.out.println("Taking snap and recording in 4k ");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"vikash", "Not", "luxxy"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to networks " + network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}
public class Not_59_polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2(); //this is a smartphone but use it as a camera
//        cam1.getNetworks(); --> Not allowed
        cam1.record4kVideo();
//cam1.sampleMeth(); --> Not allowed
MySmartPhone2 s = new MySmartPhone2();
s.sampleMeth();
s.record4kVideo();
s.getNetworks();
s.CallNumber( 995454444);
    }
}
