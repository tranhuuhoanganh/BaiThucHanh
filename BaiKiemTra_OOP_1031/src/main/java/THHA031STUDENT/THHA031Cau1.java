
package THHA031STUDENT;

import java.util.ArrayList;
import java.util.Scanner;
public class THHA031Cau1 {
    String hoTen;
    int Age;
    String masinhVien;
    
    ArrayList<THHA031Cau1> student = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(THHA031Cau1 st, Scanner sc)
    {
            System.out.print("nhap ho ten: ");
             st.hoTen = sc.nextLine();
            System.out.println("nhap tuoi: ");
             st.Age = sc.nextInt();
            System.out.println("nhap msv: ");
             st.masinhVien = sc.nextLine();
    }
    public void EnterData(ArrayList<THHA031Cau1> std,int n ,Scanner sc){
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap sinh vien thu %d:  ",i+1);
            THHA031Cau1 st = new THHA031Cau1();
            nhap(st,sc);
            std.add(st);
        }
       
    }
    
    public void Insert(){
    
    }
    
    public void Update(){
    
    }
    
    public void Delete(){
    
    }
    
    public void Display(){
    
    }
    public void shearchName(){
    
    }
}
