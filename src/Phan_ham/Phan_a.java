package Phan_ham;

import java.util.Scanner;

public class Phan_a {

    //ham tim gia tri nho nhat
    public static double min(double a, double b){
        double rs=a;
        if (b<a){
            rs=b;
        }
        return rs;
    }

    //ham tim gia tri lon nhat
    public static double max(double a, double b){
        double rs=a;
        if (b>a){
            rs=b;
        }
        return rs;
    }


    //HAM NHAP VAO 1 CHUOI KI TU ROI IN RA
     static  Scanner sc=new Scanner(System.in);

    public static String docChuoi(String chuoiYeuCau){
        System.out.println(chuoiYeuCau);
        String input =sc.nextLine();
        return input;

    }

    //ham sqrt()     tinh can bac hai cua 1 so
     public static double mySqrt(int N) {
        final double  EPSILON = 0.0001f;

        double result = 1.0f;
        while ((result * result - N) / N >= EPSILON) {
            result = (N / result - result) / 2 + result;
        }
        return result;
    }



    //HAM MAIN()
    public static void main(String[] args) {
        //goi ham tim gia tri nho nhat
        double min= min(5,4);
        System.out.println("gia tri nho nhat la "+ min);

        //goi ham tim gia tri lon nhat
        double max=  max(9,6);
        System.out.println("gia tri lon nhat la "+ max);

        //goi ham nhap vao 1 chuoi ki tu roi in ra man hinh
        String fullname = docChuoi("Ho va ten : ");
        String phone = docChuoi("So dien thoai: ");
        System.out.println("Ten ban vua nhap vao la: "+fullname);
        System.out.println("So dien thoai cua ban : "+phone );

        //goi ham can bac 2

        double a=mySqrt(25);
        System.out.println("can bac 2 cua N "+ "la : "+ a);
    }
}
