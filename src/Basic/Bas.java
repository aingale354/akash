package Basic;
//public class main{
public class Bas{
        public int FindCube(int radius) {
    int cube = radius*radius*radius;
    return cube;
}


    public static void main(String[] args) {
        int radius1 = 4;
        //int d = 8;
        //Crete Class
        Bas akash = new Bas();
        int result = akash.FindCube(radius1);
        System.out.println("sum is: " + result);

    }

}
