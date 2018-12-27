/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ManhVD
 */
public class HoaDonChiTietXuat {
    private String maHDX;
    private String maSP;
    private int soLuong;
    private int thanhTien;
    
    public HoaDonChiTietXuat(){
        
    }

    public HoaDonChiTietXuat(String maHDX, String maSP, int soLuong, int thanhTien) {
        this.maHDX = maHDX;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    

    public String getMaHDX() {
        return maHDX;
    }

    public void setMaHDX(String maHDX) {
        this.maHDX = maHDX;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
   
}
