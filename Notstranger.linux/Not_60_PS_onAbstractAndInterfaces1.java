package Notstranger.linux;


abstract class Pen{
    abstract void Write();
    abstract void Refill();

}
class FountainPen extends Pen{
    void Write(){
        System.out.println("Write");
    }
    void Refill(){
        System.out.println("Refill");
    }

    void ChangeNib(){
        System.out.println("Chagning the nib");
    }
}
public class Not_60_PS_onAbstractAndInterfaces1 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.ChangeNib();


    }
}
