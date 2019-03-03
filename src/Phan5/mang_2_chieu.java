package Phan5;

import java.util.Scanner;

public class mang_2_chieu {
    public static void main(String[] args) {
        //mảng 2 chiều có thao tác nhập các phần tử
        Scanner sc=new Scanner(System.in);

        int A[][]=new int [2][3];//khai bao
        //nhap mang
        for (int i=0;i<2;i++){
            int B[]=A[i];
            for (int j=0;j<3;j++){
                System.out.println("Nhap A["+i+"]["+j+"]=");
                B[j]=sc.nextInt()   ;

            }
        }
        //in mang
        System.out.println("mang vua nhap la:");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(A[i][j]+"      ");
            }
            System.out.println();
        }


    }
}
