package Phan2;

import java.util.Scanner;

public class ngay_thang_nam1 {
    public static void main(String[] args) {
        /*
        1.Nhap vao tu ban phim 3 tham so gom ngay,thang ,nam
        2.kiem tra xem nam do la nam nhuan hay khong
        3.thang do la thang co bao nhieu ngay
        4.ngay ban nhap vao la ngay thu may trong nam
        5.ngay ban nhap vao la ngay thu may trong tuan
        <Doomsday>
        6.thang do co thu 6 ngay 13 hay khong
        7.nam do co bao nhieu ngay la thu 6 ngay 13
        */
        Scanner sc = new Scanner(System.in);
        int nam;
        System.out.println("Nhap nam =");
        nam=sc.nextInt();
        int thang;
        int ngay;
        int count1 = 0;

        do{
            if(count1 == 0){
                System.out.println("Nhap 1 thang tu 1-12:  Thang= ");
            }else {
                System.out.println("Nhap sai thang, Moi nhap lai! Thang= ");
            }
            thang=sc.nextInt();

            if(thang<=0||thang>=13){
                count1 = count1+1;
            }else {
                break;
            }
        }while (count1>0);

        int count2=0;
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                do{
                    if(count2==0){
                        System.out.println("Nhap mot ngay tu 1 -31");
                        System.out.println("Nhap ngay =");
                    }else{
                        System.out.println("Nhap sai ngay! Moi nhap lai. Ngay=");
                    }
                    ngay=sc.nextInt();

                    if(ngay<1||ngay>31){
                        count2=count2+1;
                    }else{
                        break;
                    }

                }while (count2>0);

                break;

            }
            case 4: case 6: case 9: case 11:{
                do{
                    if(count2==0){
                        System.out.println("Nhap mot ngay tu 1 -30");
                        System.out.println("Nhap ngay =");
                    }else{
                        System.out.println("Nhap sai ngay! Moi nhap lai. Ngay=");
                    }
                    ngay=sc.nextInt();

                    if(ngay<1||ngay>30){
                        count2=count2+1;
                    }else{
                        break;
                    }

                }while (count2>0);

                break;

            }

            case 2:{
                if((nam%4==0)&&(nam%100!=0)||(nam%400==0)){
                    do{
                        if(count2==0){
                            System.out.println("Nhap mot ngay tu 1 -29");
                            System.out.println("Nhap ngay =");
                        }else{
                            System.out.println("Nhap sai ngay! Moi nhap lai. Ngay=");
                        }
                        ngay=sc.nextInt();

                        if(ngay<1||ngay>29){
                            count2=count2+1;
                        }else{
                            break;
                        }

                    }while (count2>0);
                }else{
                    do{
                        if(count2==0){
                            System.out.println("Nhap mot ngay tu 1 -28");
                            System.out.println("Nhap ngay =");
                        }else{
                            System.out.println("Nhap sai ngay! Moi nhap lai. Ngay=");
                        }
                        ngay=sc.nextInt();

                        if(ngay<1||ngay>28){
                            count2=count2+1;
                        }else{
                            break;
                        }

                    }while (count2>0);
                }
                break;
            }
            default:{
                ngay=0;
            }

        }
        System.out.println("Ngay, thang , nam ban vua nhap vao la:  "+ ngay +"/"+thang +"/"+nam);



        if((nam%4==0)&&(nam%100!=0)||(nam%400==0)){
            System.out.println("Nam "+ nam + " la nam nhuan, co 366 ngay");
            switch (thang){
                case 2: {
                    System.out.println("Thang "+thang+" co 29 ngay");
                    break;
                }
                case 4: case 6: case 9: case 11:{
                    System.out.println("Thang "+thang+" co 30 ngay");

                    break;
                }
                default:{
                    System.out.println("Thang "+thang+" co 31 ngay");

                }
            }
        }else{
            System.out.println("Nam "+ nam + " khong la nam nhuan, co 365 ngay");
            switch (thang){
                case 2: {
                    System.out.println("Thang "+thang+" co 28 ngay");

                    break;
                }
                case 4: case 6: case 9: case 11:{
                    System.out.println("Thang "+thang+" co 30 ngay");

                    break;
                }
                default:{
                    System.out.println("Thang "+thang+" co 31 ngay");

                }
            }
        }
        int s;
        s= ngay;
        for(int i=1;i<thang;i++){
            switch (i){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:{

                    s+=31;
                    break;
                }
                case 2: s+=(nam%4==0)&&(nam%100!=0)||(nam%400==0)?29:28;     break;
                default:{
                    s+=30;
                }
            }
        }
        System.out.println(ngay +"/"+thang+"/"+nam+" la ngay thu "+s+ "  trong nam");
//tinh thu cua ngay bat ki trong nam
        int dABCD;

        if(nam>=1900&&nam<2000){
            int d1990 =4;
            int CD=nam%100;
            int a= CD/12;
            int b=CD%12;
            int c= b/4;
            int d=a+b+c;
            int e=d%7;
            dABCD =d1990+e;
            if(dABCD>7){
                dABCD-=7;//chinh la doomsday cua nam nhap vao
            }else {
                dABCD=dABCD;//chinh la doomsday cua nam nhap vao
            }

        }else if(nam>=2000&&nam<2100){
            int d2000=3;
            int CD=nam%100;
            int a= CD/12;
            int b=CD%12;
            int c= b/4;
            int d=a+b+c;
            int e=d%7;
            dABCD =d2000+e;
            if(dABCD>7){
                dABCD-=7;//chinh la doomsday cua nam nhap vao
            }else {
                dABCD=dABCD;//chinh la doomsday cua nam nhap vao
            }
        }else{
            dABCD=0;
        }


        int thu1_1=dABCD-2;
        int thu=thu1_1+(s%7)-1;
        switch (thu){
            case -6: case 1: case 8: case 15:
                System.out.println("Ngay "+ ngay+" la chu nhat"); break;
            case -5: case 2: case 9: case 16:
                System.out.println("Ngay "+ngay+" la thu hai"); break;
            case -4: case 3: case 10:
                System.out.println("Ngay "+ngay+" la thu ba"); break;
            case -3: case 4: case 11:
                System.out.println("Ngay "+ngay+" la thu tu"); break;
            case -2: case 5: case 12:
                System.out.println("Ngay "+ngay+" la thu nam"); break;
            case -1: case 6: case 13:
                System.out.println("Ngay "+ngay+" la thu sau"); break;
            case 0: case 7: case 14:
                System.out.println("Ngay "+ngay+" la thu bay"); break;
        }

        switch (thang){
            case 1:{
                int thu13=thu1_1+5;
                if(thu13==6||thu13==13){
                    System.out.println("Thang 1 nay co thu 6 ngay 13");
                }else{
                    System.out.println("Thang 1 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 2:{
                int thu13=(nam%4==0)&&(nam%100!=0)||(nam%400==0)?dABCD-2:dABCD-1;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 2 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 2 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }

                }
                break;
            }
            case 3: {
                int thu13=dABCD-1;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 3 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 3 nay khong co thu 6 ngay 13");
                    //System.out.println("Ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 4: {
                int thu13 = dABCD + 2;
                if (thu13 == 6 || thu13 == -1) {
                    System.out.println("Thang 4 nay co thu 6 ngay 13");
                } else {
                    System.out.println("Thang 4 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 5:{
                int thu13=dABCD+4;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 5 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 5 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 6:{
                int thu13=dABCD;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 6 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 6 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 7:{
                int thu13=dABCD+2;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 7 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 7 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 8:{
                int thu13=dABCD+5;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 8 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 8 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 9:{
                int thu13=dABCD+1;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 9 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 9 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 10:{
                int thu13=dABCD+3;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 10 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 10 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 11:{
                int thu13=dABCD-1;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 11 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 11 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
            case 12:{
                int thu13=dABCD+1;
                if(thu13==6||thu13==-1){
                    System.out.println("Thang 12 nay co thu 6 ngay 13");
                }else {
                    System.out.println("Thang 12 nay khong co thu 6 ngay 13");
                    //System.out.println(" ngay 13 thang nay la thu "+ (thu13>7?(thu13-7):thu13));
                    switch (thu13){
                        case 2: case 3: case 4: case 5: case 6: case 7:{
                            System.out.println("Ngay 13 thang nay la thu "+ thu13); break;
                        }
                        case 0: {
                            System.out.println("Ngay 13 thang nay la thu 7"); break;

                        }
                        case 1: case 8: {
                            System.out.println("Ngay 13 thang nay la chu nhat "); break;
                        }
                    }
                }
                break;
            }
        }



        int d=0;
        switch (1){
            case 1:{
                int thu13=thu1_1+5;
                if(thu13==6||thu13==13){
                    d+=1;
                    System.out.println("Ngay 13/1 la thu 6");
                }
            }
            case 2:{
                int thu13=(nam%4==0)&&(nam%100!=0)||(nam%400==0)?dABCD-2:dABCD-1;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/2 la thu 6");


                }
            }
            case 3: {
                int thu13=dABCD-1;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/3 la thu 6");

                }
            }
            case 4: {
                int thu13 = dABCD + 2;
                if (thu13 == 6 || thu13 == -1) {
                    d+=1;
                    System.out.println("Ngay 13/4 la thu 6");


                }

            }
            case 5:{
                int thu13=dABCD+4;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/5 la thu 6");


                }
            }
            case 6:{
                int thu13=dABCD;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/6 la thu 6");


                }
            }
            case 7:{
                int thu13=dABCD+2;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/7 la thu 6");


                }
            }
            case 8:{
                int thu13=dABCD+5;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/8 la thu 6");


                }
            }
            case 9:{
                int thu13=dABCD+1;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/9 la thu 6");


                }
            }
            case 10:{
                int thu13=dABCD+3;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/10 la thu 6");


                }
            }
            case 11:{
                int thu13=dABCD-1;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/11 la thu 6");


                }
            }
            case 12:{
                int thu13=dABCD+1;
                if(thu13==6||thu13==-1){
                    d+=1;
                    System.out.println("Ngay 13/12 la thu 6");


                }
            }

        }
        System.out.println("Nam "+nam+" co "+ d+ " thu 6 ngay 13.");



    }
}
