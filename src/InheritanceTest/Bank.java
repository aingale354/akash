package InheritanceTest;

 class Bank {
    void balance(){
        System.out.println("20k is my ac. ballance");
    }
    void charges(){
        System.out.println("in 2022 i charged 220rs from by bank");
    }
}
 class akash extends Bank
 {
    void MiniTr(){
        System.out.println("5000 this my minimum trasaction on my account");
    }
    void max(){
        System.out.println("15k this my max transaction ");
    }
 }
  class relation{
     public static void main(String[] args) {
         akash aks=new akash();
         aks.max();
     }
 }