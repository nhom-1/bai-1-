package Phan5;

import java.util.Random;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        //MẢNG
        //nhap soo phan tu cua mang
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang n=");
        n=sc.nextInt();

        //Khai bao mang n phan tu
        int A[]=  new int[n];
        //nhap cac phan tu cua mang
        for(int i=0;i<n;i++){
            System.out.println("nhap phan tu thu "+ (i+1)+ "  la A["+i+"]=");
            A[i]=sc.nextInt();

        }
        //in ra cac phan tu cua mang
        System.out.println("mang vua nhap vao la :");

        for(int i=0;i<n;i++){
            System.out.println(A[i]);

        }

        //Mang B voi cac phan tu gan ngU nhien
        int B[]=new int [5];
              //impport thu vien ngau nhien
        Random rd=new Random();
        for (int i=0 ;i<5;i++){
            B[i]=rd.nextInt(9);//gan 1 so nghau nhien trong khoang tu 0 den 9

        }
        System.out.println("Mang B la :");

        for (int i=0 ;i<5;i++){
            System.out.println(B[i]);
        }

    }
}
