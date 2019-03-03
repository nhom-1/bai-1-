package Phan3;

public class _15_SNT_dau_tien {
    public static void main(String[] args) {
        //  TINH TONG CAC SO CHAN TU 0 DEN 1000
        int i=0;
        int tong=0;
        while (i<=1000){
            tong=tong+i;
            i=i+2;
        }
        System.out.println("Tong cac so chan tu 0 den 1000 la tong="+tong);

        //IN  RA MAN HINH 15 SO NGUYEN TO DAU TIEN
        //khoi tao cac bien ban dau
        int a = 1; // so hien tai can kiem tra xem co phai la so nguyen to khong
        int b; // cac gia tri lien tiep nho hon a, b se chay tu 2 den a-1
        int dem; // tong cac so ma a chia het trong khoang tu b den a
        int j = 0; // tong so nguyen to da tim duoc

        while(j<5){
            a++;
            b=2;
            dem=0;
            while(b<=a){
                if(a%b==0){
                    dem++;

                }
                b++;
            }
            if(dem==1){
                System.out.println(a);
                j++;

            }
        }
    }
}
