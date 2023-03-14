
package baithuchanhlab2;

import java.util.Scanner;

public class Bai1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        float a = sc.nextFloat();
        System.out.print("nhap b: ");
        float b = sc.nextFloat();
        //1
        System.out.println("tong = " +(a+b));
        System.out.println("tru = " +(a-b));
        System.out.println("nhan = " +(a*b));
        System.out.println("chia = " +(a/b));
        
        //2
        System.out.println((a>b)?"a>b":"a<b");
    }
    
}
