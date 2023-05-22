
package baithuchanh4;

import java.util.Scanner;
import java.util.ArrayList;

public class Slide_110 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu trong day: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap phan tu thu %d: ",i+1);
            number = sc.nextInt();
            arr.add(number);     
        }
        System.out.print("day so vua nhap la: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");   
        }       
        
        int max = arr.get(0);
        for(int i = 0; i < arr.size(); i++){
        if(max<arr.get(i))
        {
            max = arr.get(i) ;
        }     
            }
        System.out.println("\nso lon nhat la: "+max);
        
        
        // nhập vào một phần tử k 
        
        System.out.println("---------------------------------------------------");
        System.out.println("nhap vao 1 so nguyen: ");
        int k = sc.nextInt();
        arr.add(k);
        
         ArrayList<Integer> arrTemp = new ArrayList<>();
         for (int i = 0; i < arr.size(); i++) {
        if (!arrTemp.contains(arr.get(i))) {
            arrTemp.add(arr.get(i));
        }
    }
         arr.clear();
         arr.addAll(arrTemp);
        
        System.out.println("arr sau khi xoa cac phan tu giong k : ");
        System.out.println(arr);
 
        System.out.println("---------------------------------------------------");
        
        arr.sort((o1, o2) -> o1 - o2);
        System.out.println("sap xep day arr tang dan:"+arr);

    }
}
