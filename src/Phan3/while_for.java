package Phan3;

import java.util.Scanner;

public class while_for {
    public static void main(String[] args) {



        int i=6;
        while(i%5!=0){
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        }
        //vong lap while o tren tuong duong voi vong lap for sau
        for( i=6;i%5!=0;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //in ra cac so nguyen to tu 1000 den 10000
        System.out.println("Cac so nguyen to tu 1000 den 10000 la:");
        for(int a=1000;a<=10000;a++){
            int dem=0;
            for(int j=2;j<a;j++){
                if(a%j==0){
                    dem++;
                }

            }
            if(dem==0){
                System.out.println(a);
            }
        }


    }
}
