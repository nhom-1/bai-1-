package Phan5;

import java.util.Random;
import java.util.Scanner;

public class sinh_mang_ngau_nhien {
    public static void main(String[] args) {
        //sinh day so nguyen ngau nhien 100000phan tu
        int n=10;

        int A[]=new int[n];
Scanner sc= new Scanner(System.in);
        Random rd=new Random();

        for (int i=0;i<n;i++){
            A[i]=rd.nextInt(10);
//            System.out.println("Nhap A["+i+"]=");
//            A[i]=sc.nextInt();
        }
        //sap xep day theo thu tu giam dan

        int T;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(A[i]<A[j]) {
                    T=A[i];
                    A[i]=A[j];
                    A[j]=T;
                }
            }
        }
        System.out.println("Day theo thu tu giam dan la:");
        for (int i=0;i<n;i++){
            System.out.println(A[i]);
        }

//tim so co gia tri lon nhat
        int max=A[0];

        for (int i=1;i<n;i++){
            if(A[i]>max){
                    max = A[i];
            }
        }
        System.out.println("gia tri lon nhat cua day la :"+max);
//tim so co gia tri nho nhất
        int min=A[0];

        for (int i=1;i<n;i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        System.out.println("gia tri nho nhat cua day la :"+min);

        //Tìm vị trí của số nguyên có giá trị bằng k đầu tiên xuất hiện ( k nhập vào từ bàn phím )
        int k;
        System.out.println("Nhap so k= ");
        k=sc.nextInt();
        int dem=n;
        for (int i=0;i<n;i++){
            if (A[i]==k){
                System.out.println("vi tri dau tien cua so "+k+"   la :"+(i+1));
                break;
            }else {
                dem--;
            }
        }
        if (dem==0){
            System.out.println("trong day khong co so "+k);

        }

        // Tìm dãy con dài nhất có chứa các số bằng nhau. In ra độ dài dãy con đó và vị trí đầu tiên của chuỗi con này.
        int B[]= new int[n-1];
        for (int i=0;i<=n-2;i++){
            if (A[i]!=A[i+1]){
                B[i]=1;
            }else{
                //tuc la A[i]==A[i+1]
                B[i]=2;
                int G=A[i];
                int d=2;
                while(A[i+2]==G){
                    d=d+1;
                    B[i+1]=d;
                    i=i+1;

                }
                //i=i+1;
            }
        }
        System.out.println("mang B:");
        for (int i=0;i<=n-2;i++){
            System.out.println(B[i]);
        }
        int maxB=B[0];
        for (int i=1;i<=n-2;i++){
            if(B[i]>maxB){
                maxB=B[i];
            }
        }
       // System.out.println("Vi tri dau tien cua day con la :");
        System.out.println("do dai day con lon nhat la :"+maxB);

//        int B[]= new int[20];
//        for (int i=0;i<20;i++){
//            B[i]=rd.nextInt(1);
//        }
////        B[5]=3;
////        for (int i=0;i<20;i++){
////            System.out.println(B[i]);
////        }
//        int demm=0;
//        int chi_so=0;
//        for (int i=0;i<n-1;i++){
//            if (A[i]==A[i+1]){
//                int G=A[i];
//                int d=0;
//                for (int j=i;A[j]!=G;j++){
//                    d++;
//                    i++;
//                }
//                i--;
//                B[chi_so]=d;
//                //System.out.println(B[chi_so]);
//                chi_so++;
//                //System.out.println("kien");
//            }else {
//                demm++;
//            }
//        }
//        //System.out.println(demm);
//       if (demm==n-1){
//            System.out.println("khong co day con gom cac so lien tiep bang nhau");
//        }else {
//            int maxB=B[0];
//            for (int i=1;i<20;i++){
//                if (B[i]>maxB){
//                    maxB=B[i];
//                }
//            }
//            System.out.println("Do dai day con lon nhat la :"+maxB  );
//        }

//// Xóa tất cả các phần tử có giá trị bằng m và in ra các phần tử còn lại.
//        int m;
//        System.out.println("Nhap so can xoa m=");
//        m=sc.nextInt();
//        int dem2=0;
//        for (int i=0;i<n;i++){
//            if (A[i]==m){
//                A[i]=A[i+1];
//                n--;
//
//            }else{
//                dem2++;
//            }
//        }
//       // if (dem==0)


    }
}
