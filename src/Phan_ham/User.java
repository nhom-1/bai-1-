package Phan_ham;

public class User {
    //các phương thức định dạng đối với ten đăng nhập và password

    public static boolean dangKy(String email, String password) {
        boolean rs = false;
        //1. Kiem tra email: ton tai va  dung dinh dang
        //2. Kiem tra password: >=8 ky tu,
        //co it nhat 1 chu cai, 1 chu so va 1 ky tu dac biet
        //3. Ma hoa password
        //4. Luu thong tin nguoi dung vao database

        return rs;
    }

    public boolean checkEmail(String email) {
        boolean rs = false;
        email="hantrungkien98@gmail.com";
        //if (endsWith(email) == "@gmail.com")



        return rs;
    }

    public static boolean checkCharacterPass(String pass) {
        boolean rs = false;
        String regex="([a-zA-Z]{1,})([0-9]{1})([]{1})";
        if (pass!=null&&pass.matches(regex)){
            rs=true;
        }
        return rs;
    }

    public static boolean checkSizePass(String pass) {
        boolean rs = false;
        if (pass.length()>=8){
             rs=true;
        }
        return rs;
    }

    public String getSHA256(String pass) {
        String rs = null;

        return rs;
    }

    public static void main(String[] args) {
        String pass="h";
        boolean a= checkSizePass(pass);
        System.out.println("Do dai :"+a);
        boolean b= checkCharacterPass(pass);
        System.out.println("Chua it nhat 1 chu cai: "+b);
    }
}
