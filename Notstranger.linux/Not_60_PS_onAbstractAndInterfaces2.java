package Notstranger.linux;
abstract class monkey{
     void jump(){
        System.out.println("jumping");
    }
     void bite(){
         System.out.println("biting");
     }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class human extends monkey implements BasicAnimal {
    void speak(){
        System.out.println("speaking");
    }

    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class Not_60_PS_onAbstractAndInterfaces2 {
    public static void main(String[] args) {
        human vikash = new human();
        vikash.eat();

//Q5
        monkey m1  = new human();
        m1.jump();
        m1.bite();
//        m1.speak(); ---cannot sue speak methods the reference is  moneky which does not have speak method

        BasicAnimal jj = new human();
        jj.eat();
//        jj.speak();
    }
}
