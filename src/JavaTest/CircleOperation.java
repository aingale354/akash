package JavaTest;

public class CircleOperation {
    public double FindValue(int radius){
        double perimeter=2*3.14*radius;
        return perimeter;
    }
    public int red=25;
    public static void main(String[] args) {
        int radius1= 3;
        //create variable
        CircleOperation akash=new CircleOperation();
        double result=akash.FindValue(radius1);
        System.out.println("perimeter of circle is: "+result);

    }
}
