package Coding;

public class InterfaceTest {
    interface bank{
        float rateofinterest();


    }
    class sbi implements bank
    {
        public float rateofinterest() {
               return 9.13f;
        }

     class pnb implements bank
    {
        public float rateofinterest(){
        return 8.13f;
        }
    }
    public class  intefacefacetest2{
        public void main(String[] args) {
            bank roi=new sbi();
            System.out.println("ROI "+roi.rateofinterest());

        }

    }
    }
}
