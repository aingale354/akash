package Basic;
//public class main{
public class Bas{
        public int add(int a,int b) {
    int sum = a + b;
    return sum;
}


    public static void main(String[] args) {
        int s = 4;
        int d = 8;
        //Crete Class
        Bas akash = new Bas();
        int result = akash.add(s,d);
        System.out.println("sum is: " + result);

    }

}
