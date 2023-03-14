
package baithuchanhlab2;

import java.util.Scanner;


public class bai8 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
       int number ;
       int n,sum = 0;
       
       float tbc=0;
       System.out.print("nhap so cac chu so: ");
       n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            System.out.printf("so thu %d: ",i+1);
            number = sc.nextInt(); 
            sum+=number;
            tbc=sum/n;
        }
        
        System.out.println("trung binh cong cua cac so la: " +tbc);     

    }
    
    
    
}
