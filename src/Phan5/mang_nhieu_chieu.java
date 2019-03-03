package Phan5;

import java.util.Random;

public class mang_nhieu_chieu {
    public static void main(String[] args) {
        //mang 2 chieu
        int a[][]=new int [2][3];//khai bao
        //System.out.println(a.length);//độ dài mảng 2 chiều chính là số hàng cua mảng
        Random rd= new Random();

        for (int i = 0; i < 2; i++) {
            int m[] = a[i];
            for (int j = 0; j < m.length; j++) {
                m[j]=rd.nextInt(5);//gan gia trị ngãu nhiên
                System.out.println("a[" + i+"][" + j + "] = " + m[j]);
            }
        }

        //mang 3 chieu
        int A[][][]=new int[2][3][4];//khai bao
        //System.out.println(A.length);//la 2 = số mảng 2 chiều , 3 = số hàng , 4 = số cột
        for (int i=0;i< 2;i++){
            int M[][]=A[i];
            for (int j=0;j<3;j++){
                int N[]=M[j];
                for (int k=0;k<4;k++){
                    N[k]=rd.nextInt(100);
                    //System.out.println("A["+i+"]"+"["+j+"]"+"["+k+"]="+A[i][j][k]);//nếu muốn gán đén đâu in đén đấy
                }
            }
        }
        //gán xong hết mới in mảng
        for (int i=0;i< 2;i++){
            for (int j=0;j<3;j++){
                for (int k=0;k<4;k++){
                    System.out.println("A["+i+"]"+"["+j+"]"+"["+k+"]="+A[i][j][k]);
                }
            }
        }


    }
}
