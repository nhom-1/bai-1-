package Phan3;

import java.util.Scanner;

public class khai_trien_thanh_SNT {
    public static void main(String[] args) {
        //Cho so tu nhien N > 1 bat ki nhập từ bàn phím
        //*In ra khai trien thanh tich cac so nguyen to tinh tu nho den lon

        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("nhap so tu nhien N>1 ");
        System.out.println("N=");
        N=sc.nextInt();

        int k;
        for (k=2;k<=N;k++) {
            if (N % k == 0) {
                System.out.print(k + " ");
                N = N / k;
                k--;
            }
        }
    }
}
