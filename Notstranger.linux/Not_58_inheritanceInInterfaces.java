package Notstranger.linux;
interface sampleInterface{
    void meth1();
    void meth2();

}

interface  childSampleInterface extends sampleInterface{

    void meth3();
    void meth4();


}
class MysampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("meth3");

    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}
public class Not_58_inheritanceInInterfaces {
    public static void main(String[] args) {
        MysampleClass obj = new MysampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
