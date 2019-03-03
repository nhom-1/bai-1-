package Phan4;

public class Phan4a_cach2 {
    public static void main(String[] args) {
        //Tinh tong S= 1+ 1/(1+2)+ 1/(1+2+3) + ... + 1/(1+2+3+...+N)
        int N=3;
        float S=0;

        for(int i=1;i<=N;i++){
            S=S+1/((float)(i*(i+1)/2));
        }
        System.out.println(" Tong can tinh la S="+S);



    }
}
