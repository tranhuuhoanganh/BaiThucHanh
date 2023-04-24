/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QLDB {
     List<Contact> list = new ArrayList<>();

    public QLDB() {

    }

    
    public void NhapThongTin(Scanner sc) {
        while (true) {
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();
            System.out.print("Nhap sdt: ");
            String tel = sc.nextLine();
            Contact contact = new Contact(name, tel);
            list.add(contact);

            System.out.print("\nNhap Y de nhap tiep, nhap N de ve menu: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    
    public void Update(Scanner sc) {
        System.out.print("Vui long nhap ten can cap nhat: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }

        if(tim == null) {
            System.out.println("Khong tim thay vui long nhap moi:");
            NhapThongTin(sc);
        } else {
            System.out.println("Cap nhap so dien thoai: ");
            tim.setTel(sc.nextLine());
            System.out.println("Da cap nhap so dien thoai!");
            System.out.println("");
        }
    }

    
    public void Delete(Scanner sc) {
        System.out.print("Vui long nhap ten can xoa: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact!");
        } else {
            list.remove(tim);
            System.out.println("Da xoa thanh cong danh ba!");
        }


    }

    
    public void Search(Scanner sc) {
        System.out.print("Vui long nhap ten can tim: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact");
        } else {
            System.out.println("Thong tin contact ban tim: ");
            tim.InThongTin();
            
        }
        

    }
}
