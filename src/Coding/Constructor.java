package Coding;

public class Constructor {
    int a;
    String name;

    Constructor() {
        a = 25;
        name = null;

    }

    void add() {
        System.out.println(a + " " + name);
    }
}
    class V{
        public static void main(String[] args) {
            Constructor ref=new Constructor();
            ref.add();
        }
    }

