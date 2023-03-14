
package baithuchanhlab2;

import java.util.Scanner;


public class bai9 {
    public static void main(String[] args) {
        String a ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap chuoi: ");
        a = sc.nextLine();
        
        System.out.printf("chuoi co %d ky tu\n" ,a.length());
        
        System.out.println("viet thuong: " +a.toLowerCase());
        System.out.println("viet hoa: " +a.toUpperCase());

    }
}
