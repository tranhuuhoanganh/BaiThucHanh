
package baithuchanhlab2;

import java.util.Scanner;


public class bai11 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for( i = 0;i<n;i++)
        {
            System.out.printf("gia tri thu %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        for( i = 0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
          
        
    }
}
