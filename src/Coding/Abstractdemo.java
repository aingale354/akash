package Coding;

abstract class AbstactClass {
    public void show1(){
        System.out.println("Shows parrent method");
    }
    abstract public void show2();
}
class cat extends AbstactClass
{
    @Override
    public void show2() {
        System.out.println("child class show massege");
    }

    @Override
    public void show1() {
        System.out.println("child class 2 nd massege print ");

    }
}
public class Abstractdemo {
    public static void main(String[] args) {
        cat akash=new AbstactClass();
        akash.show1();
        akash.show2();

    }
}
