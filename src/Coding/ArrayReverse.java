package Coding;

public class ArrayReverse {
    public static void main(String[] args) {
/*

        StringBuffer akash = new StringBuffer(" akash ingale");
        System.out.println(akash.reverse());

    }

}
*/
        int i,in;
        String akash="akash ingale dhavalas";
        String akash2="";
         in=akash.length();
        for(i=in-1;i>=0;i--)
        {
            akash2=akash2+akash.charAt(i);
        }
        System.out.println(akash);

    }
}
