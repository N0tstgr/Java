package Notstranger.linux;

interface TvRemote{
   public void click();
   public void change();
}
interface SmartTvRemote extends TvRemote{
    public void press();
    public void watch();

}
class Tv implements SmartTvRemote{
   public void click(){
        System.out.println("clicking");
    }
    public void press(){
        System.out.println("pressing");
    }
    public void watch(){
        System.out.println("WAtching");
    }
    public void change(){
        System.out.println("Changing");
    }


}


public class Not_60_PS_onAbstractAndInterfaces4 {
    public static void main(String[] args) {
        Tv videocon = new Tv();
        videocon.watch();
        videocon.change();
    }
}
