package Phan2;

import java.util.Scanner;

public class ngay_thang_nam {
    public static void main(String[] args) {
        /*
        1.Nhap vao tu ban phim 3 tham so gom ngay,thang ,nam
        2.kiem tra xem nam do la nam nhuan hay khong
        3.thang do la thang co bao nhieu ngay
        4.ngay ban nhap vao la ngay thu may trong nam
        5.ngay ban nhap vao la ngay thu may trong tuan
        <Doomsday>
        6.thang do co thu 6 ngay 13 hay khong
        7.nam do co bao nhieu ngay la thu 6 ngay 13
        */

        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ngay a=");
        a = sc.nextInt();
        System.out.println("nhap thang b=");
        b = sc.nextInt();
        System.out.println("nhap nam c=");
        c = sc.nextInt();

        if (((c % 4 == 0)&& (c % 100 != 0)) || (c % 400 == 0)){
            System.out.println(c + "  la nam nhuan");
            switch (b) {
                case 1: {
                    System.out.println(" thang " + b + "co 31 ngay");
//                    a=1;
//                    b=1;
//                    c=1970;
                    System.out.println("do ngay thu "+a +"trong nam");
                    break;
                }
                case 2: {
                    System.out.println(" thang " + b + "co 29 ngay");
                    System.out.println("do ngay thu "+(a+31) +"trong nam");
                    break;
                }
                case 3: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29) +"trong nam");
                    break;

                }
                case 4: {
                    System.out.println(" thang " + b + "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31) +"trong nam");
                    break;

                }
                case 5: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30) +"trong nam");

                    break;

                }
                case 6: {
                    System.out.println(" thang " + b + "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31) +"trong nam");

                    break;

                }
                case 7: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30) +"trong nam");

                    break;

                }
                case 8: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30+31) +"trong nam");

                    break;

                }
                case 9:{
                    System.out.println(" thang "+b+ "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30+31+31) +"trong nam");

                    break;

                }
                case 10:{
                    System.out.println(" thang "+b+ "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30+31+31+30) +"trong nam");

                    break;

                }
                case 11:{
                    System.out.println(" thang "+b+ "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30+31+31+30+31) +"trong nam");

                    break;

                }
                case 12:{
                    System.out.println(" thang "+b+ "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+29+31+30+31+30+31+31+30+31+30) +"trong nam");

                    break;

                }
            }

        }   else {
            System.out.println(c + "  khong phai la nam nhuan");
            switch (b) {
                case 1: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+a +"trong nam");

                    break;
                }
                case 2: {
                    System.out.println(" thang " + b + "co 28 ngay");
                    System.out.println("do ngay thu "+(a+31) +"trong nam");

                    break;
                }
                case 3: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28) +"trong nam");

                    break;

                }
                case 4: {
                    System.out.println(" thang " + b + "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31) +"trong nam");

                    break;

                }
                case 5: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30) +"trong nam");

                    break;

                }
                case 6: {
                    System.out.println(" thang " + b + "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31) +"trong nam");

                    break;

                }
                case 7: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30) +"trong nam");

                    break;

                }
                case 8: {
                    System.out.println(" thang " + b + "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30+31) +"trong nam");

                    break;

                }
                case 9:{
                    System.out.println(" thang "+b+ "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30+31+31) +"trong nam");

                    break;

                }
                case 10:{
                    System.out.println(" thang "+b+ "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30+31+31+30) +"trong nam");

                    break;

                }
                case 11:{
                    System.out.println(" thang "+b+ "co 30 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30+31+31+30+31) +"trong nam");

                    break;

                }
                case 12:{
                    System.out.println(" thang "+b+ "co 31 ngay");
                    System.out.println("do ngay thu "+(a+31+28+31+30+31+30+31+31+30+31+30) +"trong nam");

                    break;

                }
            }
        }

    }
}
