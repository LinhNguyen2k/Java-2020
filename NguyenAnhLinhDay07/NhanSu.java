package devpro.vn;

public class NhanSu {
	int maNs;
	String hoDem;
	String ten;
	int namSinh;
	String gioiTinh;

	public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maNs = maNs;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;

	}

	public void hienThicb() {
		CanBo.hienThiCb();
	}

	public void hienThicn() {
		CongNhan.hienThiCn();
	}

	public double tinhLuongcb() {
		return CanBo.tinhLuongCb();
	}

	public double tinhLuongcn() {
		return CongNhan.tinhLuongCn();
	}

	public NhanSu() {
		super();
	}

	public int getMaNs() {
		return maNs;
	}

	public void setMaNs(int maNs) {
		this.maNs = maNs;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}
