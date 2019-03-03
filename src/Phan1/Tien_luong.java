package Phan1;

import java.util.Scanner;

public class Tien_luong {
    public static void main(String[] args) {

        //TÍNH TIỀN LƯƠNG NHỜ CÂU LỆNH IF ELSE
        double vat=0;
        double salary =0;
        System.out.println("Nhap luong ");
        Scanner sc = new Scanner(System.in);
        salary= sc.nextDouble();

        if (salary<9){
            vat=0;
        }else if(salary>=9&& salary <=15){
            vat = salary*10.0/100;
        }else if(salary>=15&&salary<=30){
            vat= salary*15.0/100;
        }else{
            vat=salary*20/100.0;

        }
        System.out.println("vat="+vat);
    }
}
