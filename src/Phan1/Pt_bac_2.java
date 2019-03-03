package Phan1;

import java.util.Scanner;

public class Pt_bac_2 {
    public static void main(String[] args) {

        //GIẢI PT BẬC HAI
        //ax*x+bx+c=0
        float a;
        float b;
        float c;

        System.out.println("Nhap he so cua pt");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap a=");
        a=sc.nextFloat();
        System.out.println("Nhap b=");
        b=sc.nextFloat();
        System.out.println("Nhap c=");
        c=sc.nextFloat();

        if(a==0){
            if(b!=0){
                System.out.println("pt co nghiem duy nhat x="+(-c/b));

            }else{
                if(c==0){
                    System.out.println("pt co vo so nghiem");
                }else{
                    System.out.println("pt vo nghiem");
                }
            }
        }else{
            float d;
            d=b*b-4*a*c;
            if(d<0){
                System.out.println("pt vo nghiem");

            }else if(d==0){
                System.out.println("pt co nghiem kep x="+( -b/(2*a)));
            }else {
                double x1=-b+ Math.sqrt(d)/(2*a);
                double x2=-b- Math.sqrt(d)/(2*a);

                System.out.println("pt co hai nghiem phan biet la: x=" +x1 +"va x=" +x2 );
            }
        }

    }
}
