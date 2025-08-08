package Notstranger.linux;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class Smartphone extends Telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("lifting");
    }
    void disconnect(){
        System.out.println("Disconnected");
    }
}
public class Not_60_PS_onAbstractAndInterfaces3 {
    public static void main(String[] args) {
     Smartphone iphone = new Smartphone();
     iphone.ring();
     iphone.lift();
     iphone.disconnect();

     Telephone cell  = new Smartphone();
     cell.ring();
     cell.lift();
     cell.disconnect();


    }
}
