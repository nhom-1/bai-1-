package Phan2;

import java.util.Scanner;

public class Switch_case_do_gian {
    public static void main(String[] args) {
        //SỬ DỤNG SWICH CASE ĐỂ IN RA THỨ CỦA NGAY NHẬP VÀO
        int a=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so ban can kiem tra a=");
        a=sc.nextInt();

        switch (a){
            case 1:{
                System.out.println("chu nhat");
                break;
            }
            case 2:{
                System.out.println("Thu hai");
                break;
            }
            case 3:{
                System.out.println("thu ba");
                break;
            }
            case 4:{
                System.out.println("thu tu");
                break;
            }
            case 5:{
                System.out.println("thu nam");
                break;
            }
            case 6:{
                System.out.println("thu sau");
                break;
            }
            case 7:{
                System.out.println("thu bay");
                break;
            }
            default:{
                System.out.println("Khong xu ly");
            }

        }
    }
}
