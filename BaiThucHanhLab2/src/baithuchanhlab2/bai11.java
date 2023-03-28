
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
            System.out.printf("arr[%d]: ",i+1);
            arr[i] = sc.nextInt();
        }
        
        System.out.println("mang vua nhap la: ");
        for( i = 0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
          
        int temp;
        temp = arr[0];
        for ( i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("\nsap xep theo thu tu tang dan la: ");
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
