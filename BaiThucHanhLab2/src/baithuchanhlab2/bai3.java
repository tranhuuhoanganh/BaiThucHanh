
package baithuchanhlab2;

import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        int year,age;
        String ten;
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("nhap ten: ");
    ten = sc.nextLine();
    System.out.print("Nhap nam sinh: ");
    year = sc.nextInt();
    
    age = 2023 - year;
    
    if(age>=18){
        System.out.printf("%s da gia",ten);
    }
    else if(age>=16&&age<18){
        System.out.printf("%s dang o do tuoi truong thanh",ten);
    }
    else 
        System.out.printf("%s dang o tuoi vi thanh nien",ten);
        
        
    }
    
}
