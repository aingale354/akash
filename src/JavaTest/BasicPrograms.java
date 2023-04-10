package JavaTest;

public class BasicPrograms {
    public int multipication(int a, int b, int c) {
        int res=a*b*c;
        return res;
    }

    public static void main(String[] args) {
        int d=46;
        int e=47;
        int f=48;
        //creATE VARIABLE
        BasicPrograms akash=new BasicPrograms();
        int resum= akash.multipication(d,e,f);
        System.out.println(resum);
    }
}
