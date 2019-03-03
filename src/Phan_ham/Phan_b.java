package Phan_ham;

public class Phan_b {

    //ham in ra han trung kien
    public  static void inChuoiDonGian(){

        System.out.println("Han Trung Kien ");
    }

    //ham in ra mot so nguyen bat ki co san
    public static int nguyen(int a){
        //System.out.println("So nguyen can in ra la: "+10); (nhu nay cung duoc hoac in ra khi goi ham )
        return a;
    }

    //ham in ra mot chuoi ki tu biet truoc
    public static String chuoiA(String A){

        return A;
    }

    //ham in ra cac so nguyen tu 1 den 100 bang vong lap for
    public static void ham1(int i, int n){
        for ( i=0;i<n;i++){
            System.out.println((i+1));
        }
    }
    //HAM MAIN()
     public static void main(String[] args) {
        //goi ham in han trung kien
        inChuoiDonGian();

        //goi ham in ra so nguyen
        int a= nguyen(10);
         System.out.println("so nguyen ban can in ra la : "+a);

        //goi ham in ra choi ki tu
         String chuoiA =chuoiA("han trung kien ");
         System.out.println("chuoi can in ra la:  "+ chuoiA);

         //goi ham vong lap for
         System.out.println("cac so nguyen t 1 den 100 la : ");
         ham1(0,100);



        //goi ham nhap xau roi in ra tu class Phan_a
       String Diachi = Phan_a.docChuoi("Dia chi o hien tai cua ban: ");
        System.out.println("Dia chi cua ban la: "+ Diachi);
    }
}
