package Phan1;

import java.util.Scanner;

public class Kiem_tra_tam_giac1 {
    public static void main(String[] args) {
        //KIỂM TRA 3 CẠNH CỦA MỘT TAM GIÁC NHỜ 1 CÂU LỆNH IF ELSE DUY NHẤT
        System.out.println("Day la phan 1 d");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Moi ban nhap vao do dai 3 canh");
        System.out.println("Nhap canh a=");
        a = sc.nextInt();
        System.out.println("Nhap canh b=");
        b = sc.nextInt();
        System.out.println("Nhap canh c=");
        c = sc.nextInt();
        if((a+b>c)&&(b+c>a)&&(c+a>b)){
            System.out.println("Day la 3 canh cua mot tam giac");

        }else{
            System.out.println("Day khong phai la 3 canh cua mot tam giac");
        }
    }
}
