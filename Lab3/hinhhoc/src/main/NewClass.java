package main;
import java.util.Scanner;
        
import hinhhoc.HinhChuNhat;
import hinhhoc.HinhVuong;
import hinhhoc.HinhTron;
import hinhhoc.HinhTruTron;
public class NewClass {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        ht.XuatTen();
        ht.NhapBanKinh(sc);
        ht.tinhChuvi();
        ht.tinhDienTich();
        ht.InChuVi();
        ht.InDienTich();

        HinhTruTron hTru = new HinhTruTron();
        hTru.XuatTen();
        hTru.NhapBanKinh(sc);
        hTru.NhapChieuCao(sc);
        hTru.tinhTheTich();
        hTru.InTheTich();;

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.XuatTen();
        hcn.NhapChieuDai(sc);
        hcn.NhapChieuRong(sc);
        hcn.TinhChuVi();
        hcn.tinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();

        HinhVuong hv = new HinhVuong();
        hv.XuatTen();
        hv.NhapCanh(sc);
        hv.TinhChuVi();
        hv.tinhDienTich();
        hv.InChuVi();
        hv.InDienTich();

    }
    
}