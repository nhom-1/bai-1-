package Phan1;

import java.util.Scanner;

public class Mang_don_thuan {
    public static void main(String[] args) {
        //KHAI BÁO MẢNG VÀ CẤP PHÁT BỘ NHỚ CHO MẢNG
        System.out.println("Day la phan 1 e");
        System.out.println("Nhap mang 1 chieu");


        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];//Khai bao mang va cap phat bo nho cho mang
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + "  la A[" + i + "]=");

            A[i] = sc.nextInt();
        }
        //in mang

        for (i = 0; i < 5; i++) {
            System.out.print(A[i] + "     ");
        }
    }
}
