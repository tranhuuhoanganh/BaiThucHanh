
package main;

import hinhhoc.HinhChuNhat;
import hinhhoc.HinhVuong;
import hinhhoc.HinhTron;
import hinhhoc.HinhTruTron;
public class NewClass {
    public static void main(String[] args) {
        
        HinhChuNhat hcc = new HinhChuNhat();
        hcc.xuatTen();
        hcc.nhapChieu();
        hcc.tinhChuVi();
        hcc.tinhDienTich();
        hcc.inChuVi(); 
        hcc.inDienTich();
        
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inDienTich();
        hv.inChuVi();
        
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        
        HinhTruTron htt = new HinhTruTron();
        htt.xuatTen();
        htt.nhapChieuCao();
        htt.tinhTheTich();
        htt.inTheTich();
        
    }
    
}
