package ss5_access_modifier;

import java.util.Scanner;

public class ChuyenHoaKiTu {
    private String st;

    public ChuyenHoaKiTu(String s) {
        st = s;
    }

    public ChuyenHoaKiTu() {
    }


    String nhapString() {
        String x;
       Scanner ip = new Scanner(System.in);
        try {
            x = ip.nextLine();
        } catch (Exception e) {
            System.out.println("Nhap lai!");
            x = nhapString();
        }
        return x;
    }

    public void nhapXau() {
        System.out.println("Nhap xau: ");
        st = nhapString();
    }

    public void hienThi() {
        System.out.println(st);
    }


    public void chuannHoa() {
        st = st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp = st.split(" ");
        st = "";
        for (int i = 0; i < temp.length; i++) {
            st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                st += " ";
        }
    }
//    public void chuannHoaDoc() {
//        st = st.trim().toUpperCase();
//        st = st.replaceAll("\\s+", ".");
//        String[] temp = st.split(" ");
//        st = "";
//        for (int i = 0; i < temp.length; i++) {
//            st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
//            if (i < temp.length - 1)
//                st += " ";
//        }
//    }


    public static void main(String[] args) {
        ChuyenHoaKiTu a = new ChuyenHoaKiTu();
        a.nhapXau();
        a.chuannHoa();
        System.out.println("Xau sau khi chuan hoa: ");
        a.hienThi();

    }

}
