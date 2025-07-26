package Notstranger.linux;
interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class MyCellPhone{
    void CallNumber(int phoneNumber)
    {
        System.out.println("CAlling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi ,MyCamera{
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
}
public class Not_57_defaultsmethods {
    public static void main(String[] args) {
MySmartPhone ms = new MySmartPhone();
ms.record4kVideo();
//ms.greet(); --throughs an error --/
String[] ar = ms.getNetworks();
for (String item:               ar) {
    System.out.println(item);
}
    }
}
