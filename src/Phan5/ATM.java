package Phan5;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //UNG DUNG CAY atm
        System.out.println("MOI BAN DUA THE VAO DAY:");
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            if (dem == 0) {
                System.out.println("Moi ban chon ngon ngu: 1.Tieng Viet ---------2.English");
            } else {
                System.out.println("Nhap sai . Moi nhap lai.");
            }
            a = sc.nextInt();

            if (a < 1 || a > 2) {
                dem = dem + 1;

            } else {
                break;
            }

        } while (dem > 0);


        int dem1 = 0;

        switch (a) {
            case 1: {
                do {
                    if (dem1 == 0) {
                        System.out.println("1.Kiem tra so du");
                        System.out.println("2.Doi mat khau");
                        System.out.println("3.Rut tien ");
                        System.out.println("4.Chuyen tien");
                    } else {
                        System.out.println("Nhap sai moi nhap lai");

                    }
                    int b;
                    b = sc.nextInt();

                    if (b < 1 || b > 4) {
                        dem1++;

                    } else {
                        break;
                    }


                } while (dem1 > 0);
                break;

            }
            case 2: {
                do {
                    if (dem1 == 0) {
                        System.out.println("1.Check balance");
                        System.out.println("2.Change Password");
                        System.out.println("3.Withdrawal money ");
                        System.out.println("4.Transfers money");
                    } else {
                        System.out.println("Syntax error. Re-enter");

                    }
                    int b;
                    b = sc.nextInt();

                    if (b < 1 || b > 4) {
                        dem1++;

                    } else {
                        break;
                    }


                } while (dem1 > 0);
                break;


            }
        }
    }

}
