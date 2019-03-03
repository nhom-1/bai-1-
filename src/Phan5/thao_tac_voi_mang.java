package Phan5;

import java.util.Random;

public class thao_tac_voi_mang {
    public static void main(String[] args) {


        int A[]=new int [10];//khai báo mảng 10 phần tử
        int l=A.length;//cú pháp lấy độ dài của mảng A

        //gán giá trị cho các phần tử trong mảng
        for(int i=0;i<l;i++){
            A[i]=i;
        }

        //in ra các phần tử của mảng
        for(int i=0;i<l;i++){
            System.out.println("A["+i+"]="+A[i]);
        }

        //cách gán cho mỗi phần  tử của mảng một giá trị bất kì
        Random rd = new Random();//import thư viện ngẫu nhiên

        int B[]= new int[10];//khai báo mảng B có 10 phần tử
        for(int i=0;i<10;i++){
            B[i] = rd.nextInt(5);//gán cho mỗi phần tử của B một giá trị bất kì trong khoảng từ 0 đén  5

        }

        //in ra các phần tử vừa gán chpo mảng B
        for(int i=0;i<10;i++){
            System.out.println(B[i]);

        }
    }
}
