package Phan_ham;

public class Nap_chong {
     //NAP CHONG CAC PHUONG THUC TIM GIA TRI LON NHAT
    //so nguyen
    public static double Int(int a,int b){
        int max=a;
        if (b>max){
            max=b;
        }
        return max;

    }
    //so thuc
    public static double Float(float a,float b){
        float max=a;
        if (b>max){
            max=b;
        }
        return max;

    }
    //so thuc
    public static double Double(double a,double b){
        double max=a;
        if (b>max){
            max=b;
        }
        return max;

    }

    //NAP CHONG CACA PHUONG THUC DANH NHAP
    public static boolean dangNhap(String email,String password){
        System.out.println("Dang nhap bang email: ");
        return false;
    }

    public static boolean dangNhap(String facebook){
        System.out.println("Dang nhap bang facebook: ");
        return false;
    }
    public static boolean dangNhap(String google,int  password){
        System.out.println("Dang nhap bang google: ");
        return false;
    }


    public static void main(String[] args) {

        //goi ham
        //hai so nguyen
        int maxInt=(int)Int(5,6);
        System.out.println("Gia tri lon nhat la: "+ maxInt );

        //hai so thuc kieu float
        float maxFloat=(float)Float(1.5f,2.4f);
        System.out.println("Gia tri lon nhat la: "+ maxFloat );

        //hai so thuc kieu double
        double maxDouble=Double(1.2d,2.4d);
        System.out.println("Gia tri lon nhat la: "+ maxDouble );

        //goi ham dang nhap
        boolean a= dangNhap("hantrungkien");
        System.out.println(a);

    }

}
