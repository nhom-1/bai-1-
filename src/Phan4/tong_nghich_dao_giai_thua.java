package Phan4;

public class tong_nghich_dao_giai_thua {
    public static void main(String[] args) {
        //S = 1 + 1/2! + 1/3! +...+ 1/N!
        int N=4;
        float S=0;
        for(int i=1;i<=N;i++){
            float S1=1;
            for(int j=1;j<=i;j++){
                S1=S1*j;
            }
            S=S+1/S1;

        }
        System.out.println("Tong can tinh la S="+S);
    }
}
