/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.HashSet;
import java.util.Scanner;

public class slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hsStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        hsStrings.add("Wilson");
        hsStrings.add("Nike");
        hsStrings.add("Volvo");
        hsStrings.add("Kia");
        hsStrings.add("Lenovo");
        hsStrings.add("Lenovo");


        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hsStrings);
        System.out.print("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        sc.close();
        if (hsStrings.contains(name)) {
            hsStrings.remove(name);
            System.out.println("Da xoa thanh cong phan tu " + name);
            System.out.println("Phan tu con lai la: ");
            System.out.print(hsStrings);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}