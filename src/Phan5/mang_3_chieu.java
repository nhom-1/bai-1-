package Phan5;

import java.util.Scanner;

public class mang_3_chieu {
    public static void main(String[] args) {
        //mảng 3 chiều có tháo tác nhập các phần tử
        Scanner sc = new Scanner(System.in);

        int A[][][] = new int[2][3][4];//khai bao
        System.out.println("Nhap mang:");

        for (int i = 0; i < 2; i++) {
            int B[][] = A[i];
            for (int j = 0; j < 3; j++) {
                int C[] = B[j];
                for (int k = 0; k < 4; k++) {
                    System.out.println("Nhap A[" + i + "][" + j + "][" + k + "]=");
                    C[k] = sc.nextInt();

                }
            }
        }
        //in mang
        System.out.println("mang vua nhap vao la:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(A[i][j][k] + "     ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
