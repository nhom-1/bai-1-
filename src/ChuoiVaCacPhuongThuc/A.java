package ChuoiVaCacPhuongThuc;

public class A {
    public static void main(String[] args) {
        //khai bao 1 chuoi
        String chuoiS=" han trung kien ";
        String chuoiR="hello world";
        //in mot chuoi co ban
        System.out.println(chuoiS);
        System.out.println(chuoiR);

        //thao tac voi chuoi
        System.out.println("Ho va ten: han Trung Kien\nMa so sinh vien: 20162220");
        System.out.print("\t+ Họ và tên: Tuấn\n\t+ Tuổi: 40");
        //lay chuoi con
        String a=" Han Trung kien Trung    ";
        //chuyen sang in thuong
        System.out.println(a.toLowerCase());
        //doi sang in hoa
        System.out.println(a.toUpperCase());
        //cat cac ki tu trang hai dau chuoi
        System.out.println(a.trim());
        //layy do dai chuoi
        System.out.printf("Do dai cua chuoi la : "+a.length());
        //lay cac ki tu tu 0 den 2
        String b=a.substring(0,3);
        System.out.println("\n"+b);//in ra chuoi b
        //lay ki tu tai mot vi tri nao do
        System.out.println(a.charAt(5));//lay tai vi tri so 5
        //tim kiem vva thay the tat ca bang phan chuoi moi
        System.out.println(a.replaceAll("Han","Tran"));
        //tach chuoi thanh mang
        System.out.println(a.split("Han"));
        //so sanh bang co phan biet chu hoa thuong
        String c=" han Trung kien     ";
        System.out.println(a.equals(c));//tra ve true neu dung/ false neu sai
        //so sanh hai chuoi khong phan biet hoa thuong
        System.out.println(a.equalsIgnoreCase(c));//tra ve true neu dung/ false neu sai
        //kiem tra co chua..... hay khong
        System.out.println(a.contains("HanT"));//tra ve true neu dung/ false neu sai
        //kiem tra xemm co bat dau bang ...hay khong
        System.out.println(a.startsWith(" Han"));//tra ve true neu dung/ false neu sai
        //kiem tra xem co ket thuc boi hay khong
        System.out.println(a.endsWith("   "));
        //so xem co khop voi ... hay khong
        System.out.println(a.matches(" Han Trung kien     "));
        //tim vi tri xuat hien dau tien cua chuoi con
        System.out.println(a.indexOf("Trung"));//no se tim vi tri xuat hien cua chu T trong chu Trung dau tien
        //tim vi tri xuat hien cuoi cung cua chuoi con
        System.out.println(a.lastIndexOf("Trung")); //no se tim vi tri xuat hien cua chu T trong chu Trung cuoi cung
        //**********************************************************************

        //vi du: Dang nhap hop le la khi tai khoan la "hantrungkien" va mat khau lon hon 6 ki tu
        String tenDN="hantrungkien   ";
        String matKhau="1234567";
       if (tenDN.matches("hantrungkien") && matKhau.length()>6){
           System.out.println("DANG NHAP THANH CONG");
       }else{
           System.out.println("DANG NHAP THAT BAI ");

       }

       //vi du: Nhap mang ho va ten cac sinh vien
        //1.in ra ho va ten tat ca cac sinh vien
        //2.in ra ho va ten cac sinh vien ten Tuan
        //3.in ra ho va ten tat ca cac sinh vien ten Tuan hoac ho Nguyen
        //4.in ra tat ca cac ten sinh vien co ten lot la Van
        //5. Thay het ho Nguyen thanh ho Mai
        String A[]=new String[5];
       A[0]="         Han Trung Kien";
       A[1]="      Mai Van Tuan";
       A[2]=" Nguyen Van Tai";
       A[3]="Nguyen Van Tuan      ";
       A[4]="     Tran Thanh Tung ";
        System.out.println("Yeu cau 1: ------------------------");
       for (int i=0;i<A.length;i++){
           A[i]=A[i].trim();
           System.out.println(A[i]);
       }
       //in ra cac sinh vien ten Tuan
        System.out.println("Cac sinh vien ten Tuan la :--------------- ");
       for (int i=0;i<A.length;i++){
           if (A[i].endsWith("Tuan")){
               System.out.println(A[i]);
           }
       }
        //3.in ra ho va ten tat ca cac sinh vien ten Tuan hoac ho Nguyen
        System.out.println("Cac sinh vien co ten Tuan hoac ho Nguyen la :-----------------");
        for (int i=0;i<A.length;i++){
            if (A[i].endsWith("Tuan")||A[i].startsWith("Nguyen")){
                System.out.println(A[i]);
            }
        }
        //4.in ra tat ca cac ten sinh vien co ten lot la Van
        System.out.println("Cac sinh vien co ten lot la Van la : _____________________");
        for (int i=0;i<A.length;i++){
             if (A[i].contains("Van")){
                 System.out.println(A[i]);
             }
        }
        //5. Thay het ho Nguyen thanh ho Mai
        System.out.println("Cac tenn da duoc thay the la : ____________________________");
        for (int i=0;i<A.length;i++){
            if (A[i].startsWith("Nguyen")){
                A[i]=A[i].replace("Nguyen","Mai");
                System.out.println(A[i]);
            }
        }
        //tach Ho, Lot, Ten cua A[0]
        System.out.println("Ho: " + A[0].split(" ")[0]);
        System.out.println("Lot: " + A[0].split(" ")[1]);
        System.out.println("Ten: " + A[0].split(" ")[2]);

    }
}
