package Bai02;

public class CongNhan extends NhanSu {
 
	XuongSX xuongSx;
	public CongNhan(XuongSX xuongSx, String congViec, int soNgayCong, double luong) {
		super();
		this.xuongSx = xuongSx;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
		this.luong = luong;
	}
	public XuongSX getXuongSx() {
		return xuongSx;
	}
	public void setXuongSx(XuongSX xuongSx) {
		this.xuongSx = xuongSx;
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	private String congViec;
	private int soNgayCong;
	private double luong;
	
	
}
