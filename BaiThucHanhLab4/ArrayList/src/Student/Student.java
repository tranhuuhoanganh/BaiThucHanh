package Student;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student{
    public String FullName;
    public int Age;
    Scanner sc = new Scanner(System.in);

    public void nhap(Student st, Scanner sc){
        System.out.print("Ho ten: ");
        st.FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        st.Age = Integer.parseInt(sc.nextLine());
    }

    //List
    public void NhapThongTin(List<Student> std, int n, Scanner sc){
        for(int i = 0; i < n; i++){
            System.out.println("===Nhap sinh vien thu " + (i + 1) + "===");
            Student student = new Student();
            nhap(student, sc);
            std.add(student);
        }
    }

    //Set
    public void NhapThongTin(Set<Student> std, int n, Scanner sc){
        for(int i = 0; i < n; i++){
            System.out.println("===Nhap sinh vien thu " + (i + 1) + "===");
            Student student = new Student();
            nhap(student, sc);
            std.add(student);
        }
    }

    public void hienthi(){
        System.out.print("Ho ten: " + FullName + "\nTuoi: " + Age);
        System.out.println("");
    }

    //List
    public void HienThiThongTin(List<Student> std){
        System.out.println("===Thong tin tat ca sinh vien===");
        for(Student student : std){
            student.hienthi();
        }
    }

    //Set
    public void HienThiThongTin(Set<Student> std){
        System.out.println("===Thong tin tat ca sinh vien===");
        for(Student student : std){
            student.hienthi();
        }
    }

    //List
    public void SuaThongTin(List<Student> std, Scanner sc){
        System.out.println("===Sua thong tin===");
        System.out.print("Nhap ten nguoi can sua thong tin: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for(Student student : std){
            if(student.FullName.contains(tim)){
                stTim = student;
                break;
            }
        }
        if(stTim != null){
            System.out.print("Nhap Ho Ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap Tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            stTim.FullName = ten;
            stTim.Age = tuoi;

        }else{
            System.out.println("Khong tim thay sinh vien can sua! ");
        }
    }

    //Set
    public void SuaThongTin(Set<Student> std, Scanner sc){
        System.out.println("===Sua thong tin===");
        System.out.print("Nhap ten sinh vien can sua thong tin: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for(Student student : std){
            if(student.FullName.contains(tim)){
                stTim = student;
                break;
            }
        }
        if(stTim != null){
            System.out.print("Nhap Ho Ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap Tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            stTim.FullName = ten;
            stTim.Age = tuoi;

        }else{
            System.out.println("Khong tim thay sinh vien can sua! ");
        }
    }

    //List
    public void XoaThongTin(List<Student> std, Scanner sc){
        System.out.println("===Xoa sinh vien===");
        System.out.print("Nhap ten sinh vien can xoa: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for(Student student : std){
            if(student.FullName.contains(tim)){
                stTim = student;
                break;
            }
        }
        if(stTim != null){
            std.remove(stTim);
            System.out.println("Da xoa thanh cong sinh vien! ");
        }else{
            System.out.println("Khong tim thay sinh vien can xoa! ");
        }
    }

    //Set
    public void XoaThongTin(Set<Student> std, Scanner sc){
        System.out.println("===Xoa sinh vien===");
        System.out.print("Nhap ten sinh vien can xoa: ");
        String tim = sc.nextLine();
        Student stTim = null;
        for(Student student : std){
            if(student.FullName.contains(tim)){
                stTim = student;
                break;
            }
        }
        if(stTim != null){
            std.remove(stTim);
            System.out.println("Da xoa thanh cong sinh vien! ");
        }else{
            System.out.println("Khong tim thay sinh vien can xoa! ");
        }
    }
}