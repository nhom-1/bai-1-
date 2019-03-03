package Phan4;

public class tong_nghich_dao {
    public static void main(String[] args) {
        //Tinh tong S= 1+ 1/(1+2)+ 1/(1+2+3) + ... + 1/(1+2+3+...+N)
        int N=3;
        float S=0;

        for(int i=1;i<=N;i++){
            float S1=0;
            for(int j=0;j<=i;j++){
                S1=S1+j;

            }
            S=S+1/S1;

        }
        System.out.println(" Tong can tinh la S="+S);


    }
}
