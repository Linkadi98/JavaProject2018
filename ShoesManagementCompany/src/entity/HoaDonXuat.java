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
public class HoaDonXuat {
    private String maHDX;
    private String maKH;
    private String maNV;
    private String ngayLap;
    private String ngayXuatHang;
    
    public HoaDonXuat(){
        
    }

    public HoaDonXuat(String maHDX, String maKH, String maNV, String ngayLap, String ngayXuatHang) {
        this.maHDX = maHDX;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayLap = ngayLap;
        this.ngayXuatHang = ngayXuatHang;
    }

    public String getMaHDX() {
        return maHDX;
    }

    public void setMaHDX(String maHDX) {
        this.maHDX = maHDX;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNgayXuatHang() {
        return ngayXuatHang;
    }

    public void setNgayXuatHang(String ngayXuatHang) {
        this.ngayXuatHang = ngayXuatHang;
    }
}
