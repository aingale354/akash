package Coding;

public class MethodOverriding {
    void developer(int a) {
        System.out.println("salary is enough");
    }
}
    class akash extends MethodOverriding {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        void developer2(int a){
            super.developer(26);
            System.out.println("salary is less");
        }

    }
    class demo{
        public static void main(String[] args) {
            MethodOverriding me=new akash();// upcasting
            me.developer(25);
        }
    }