package Phan3;

public class Phan3b {
    public static void main(String[] args) {
        //in ra man hinh 15 so nguyen to dau tien
        //khoi tao cac bien ban dau
        int a=1;
        int b;
        int dem;
        int j=0;

        while( j<15){
            a++;
            dem=0;
           for(b=2;b<=a;b++) {
               if(a%b==0){
                   dem++;

               }
           }
           if(dem==1){
               System.out.println(a);
               j++;

           }
        }
    }
}
