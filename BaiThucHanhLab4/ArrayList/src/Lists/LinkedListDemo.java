package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Student.Student;

public class LinkedListDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> std = new LinkedList<>();
        Student st = new Student();

        do{
            System.out.println("===Quan ly sinh vien===");
            System.out.println("1. Tao n sinh vien ");
            System.out.println("2. Sua thong tin sinh vien ");
            System.out.println("3. Xoa thong tin sinh vien ");
            System.out.println("4. In thong tin sinh vien ");
            System.out.print("Moi ban lua chon: ");
            String chon = sc.nextLine();
            switch(chon){
                case "1":
                    System.out.println("===Nhap thong tin===");
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(sc.nextLine());
                    st.NhapThongTin(std, n, sc);
                    break;

                case "2":
                    st.SuaThongTin(std, sc);
                    break;

                case "3":
                    st.XoaThongTin(std, sc);
                    break;

                case "4":
                    st.HienThiThongTin(std);
                    break;

                default:
                    System.out.println("Vui long nhap lai! ");
                    System.out.println("");
                    break;
            }
        }while(true);
    }
}