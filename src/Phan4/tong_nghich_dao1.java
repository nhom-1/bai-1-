package Phan4;

public class tong_nghich_dao1 {
    public static void main(String[] args) {
        //S= 1 + 1/(1+2!) + 1/(1+2!+3!) +...+ 1/(1+2!+3!+...+N!)
        float S=0;
        int N=4;
        for(int i=1;i<=N;i++){
            float A=0;
            for(int j=1;j<=i;j++){
                float B=1;
                for(int k=1;k<=j;k++){
                    B=B*k;
                }
                A=A+B;
            }
            S=S+1/A;

        }
        System.out.println("Tong can tinh la S="+S);
    }
}
