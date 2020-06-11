package devpro.vn;

import java.text.NumberFormat;
import java.util.Locale;

public class CanBo extends NhanSu {
	Phong phong;
	String chucVu;
	double heSoLuong;
	String xepLoai;

	public CanBo() {
		super();
	}

	public CanBo(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, Phong phong, String chucVu,
			double heSoLuong, String xepLoai) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.phong = phong;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.xepLoai = xepLoai;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public String getTenPhong() {
		return phong.getTenPhong();
	}

	public String getTruongPhong() {
		return phong.getTruongPhong();
	}

	public double tinhLuongcb() {
		double luong;
		if (xepLoai == "A") {
			luong = 1150000 * heSoLuong + 1000000;
		} else if (xepLoai == "B") {
			luong = 1150000 * heSoLuong;
		} else if (xepLoai == "C") {
			luong = 1150000 * heSoLuong - 400000;
		} else {
			luong = 1150000 * heSoLuong - 1000000;
		}
		return luong;
	}

	public static double tinhLuongCb() {
		return tinhLuongCb();
	}

	public void hienThicb() {

		System.out.printf("%4d", maNs);
		System.out.printf("%10s", ten);
		System.out.printf("%10d", namSinh);
		System.out.printf("%11s", gioiTinh);
		System.out.printf("%10s", phong.getTenPhong());
		System.out.printf("%19s", phong.getTruongPhong());
		System.out.printf("%15s", chucVu);
		System.out.printf("%10.0f", heSoLuong);
		System.out.printf("%13s", xepLoai);
		System.out.printf("%17.2f", tinhLuongcb());
		System.out.printf("%3s", "VNĐ");
	}

	public static void hienThiCb() {
		// TODO Auto-generated method stub

	}
}
