package Bai02;

public class NhanSu {

	private int maNS;
	private String hoDem;
	private String ten;
	private String namSinh;
	private String gioiTinh;
	public NhanSu() {
		super();
	}
	public NhanSu(int maNS, String hoDem, String ten, String namSinh, String gioiTinh) {
		super();
		this.maNS = maNS;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	public int getMaNS() {
		return maNS;
	}
	public void setMaNS(int maNS) {
		this.maNS = maNS;
	}
	public String getHoDem() {
		return hoDem;
	}
	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}
