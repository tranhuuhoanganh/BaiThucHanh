
package baithuchanhlab2;

import java.util.Scanner;


public class bai6 {
    public static void main(String[] args) {
        int i=1;
        int a = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap number: ");
        int number = sc.nextInt();
        
        while(i<=number){
            a*=i;
            i++;
        }
        System.out.println("luy thua cua : " +a);
       
        }
}
