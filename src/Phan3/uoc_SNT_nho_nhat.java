package Phan3;

import java.util.Scanner;

public class uoc_SNT_nho_nhat {
    public static void main(String[] args) {
        //         Cho so tu nhien N bat ki nhập từ bàn phím,tim va in ra uoc so nguyen to nho nhat cua N
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap N=");
        int N;

        N=sc.nextInt();



        if(N==2||N==3){
            System.out.println("uoc so nguyen to nho nhat cua N la"+ N);
        }else {
            for(int i=2;i<=N;i++){
                if (N%i==0){
                    int dem=0;
                    for(int j=2;j<i;j++){
                        if(i%j==0){
                            dem++;
                        }
                    }
                    if(dem==0){
                        System.out.println("uoc so nguyen to nho nhat cua N la"+i);
                        break;
                    }
                }


            }
        }
    }
}
