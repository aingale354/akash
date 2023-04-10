package JavaTest;
//find the perimeter of cicle
public class FindPerimeter {
    public double perimeter(int radius ){
        double resule=2*3.14*radius;
        return resule;
    }

    public static void main(String[] args) {
        int red=22;
        //Create Variable
        FindPerimeter akash=new FindPerimeter();
        double peri=akash.perimeter(red);
        System.out.println(peri);
    }
}
