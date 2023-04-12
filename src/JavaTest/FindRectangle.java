package JavaTest;

public class FindRectangle {
    public int Rectangle(int length,int width) {
        int result=2*length+2*width;
        return result;
    }

    public static void main(String[] args) {
        int len=25;
        int wid=26;
        //create variable
        FindRectangle aksh=new FindRectangle();
        int res=aksh.Rectangle(len,wid);
        System.out.println("perimeter Of Rectancgle is: " +res);
    }
    CircleOperation akash=new CircleOperation();

    System.out.println(akash.red);

}
