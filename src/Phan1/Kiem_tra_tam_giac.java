package Phan1;

import java.util.Scanner;

public class Kiem_tra_tam_giac {
    public static void main(String[] args) {
            //NHAP DO DAI 3 CANH KIEM TRA XEM DO CO LA DO DAI BA CANH CUA TAM GIAC HAY KHONG NHO CAU LENH DIEU KIEN
            Scanner sc=new Scanner(System.in);
            float a,b,c;
            System.out.println("Nhap do dai 3 canh da cho");
            System.out.println("Nhap do dai a=");
            a=sc.nextFloat();
            System.out.println("Nhap do dai b=");
            b=sc.nextFloat();
            System.out.println("Nhap do dai c=");
            c=sc.nextFloat();

            System.out.println("Do dai 3 canh ban vua nhap vao la: "+a+"    " +b+"      " +c);
            System.out.println((a+b>c)&&(b+c>a)&&(c+a>b)?"Day la 3 canh cua mot tam giac":"Day khong phai la 3 canh cua mot tam giac");
        kakakak
            
    }
}
