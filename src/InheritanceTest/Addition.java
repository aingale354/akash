package InheritanceTest;

public class Addition {
    public double FindArea(int radius){
       double vijay=3.14*radius*radius;
       return vijay;

    }

    public static void main(String[] args) {
        int rdus=12;
        Addition aks=new Addition();
        double result= aks.FindArea(rdus);
        System.out.println(aks.FindArea(12));
    }
}
