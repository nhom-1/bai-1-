package Phan3;

import java.util.Scanner;

public class kiem_tra_SNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//KIEM TGRA 1 SO NHAP VAO CO PHAI LA MOT SO NGUYEN TO HAY KHONG

        int N;

        System.out.println("Nhap N=");
        N= sc.nextInt();

        if(N==1){
            System.out.println("1 khong phai la so nguyen to");
        }else if(N>=2&&N<=4){
            System.out.println("N la so nguyen to");
        }else {
            int dem=0;
            for(int i=2;i<N;i++){
                if(N%i==0){
                    dem++;
                }
            }
            if(dem==0){
                System.out.println(N +" la so nguyen to");
                System.out.println(N);
            }else{
                System.out.println(N +" khong la so nguyen to");
            }
        }

    }
}
