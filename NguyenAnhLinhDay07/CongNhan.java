package devpro.vn;

import java.text.NumberFormat;
import java.util.Locale;

public class CongNhan extends NhanSu {
	XuongSX xuongSx;
	String congViec;
	int soNgayCong;

	public CongNhan() {
		super();
	}

	public CongNhan(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, XuongSX xuongSx, String congViec,
			int soNgayCong) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.xuongSx = xuongSx;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
	}

	public String getTenXuong() {
		return xuongSx.getTenXuong();
	}

	public String getQuanDoc() {
		return xuongSx.getQuanDoc();
	}

	public int getSoCongNhan() {
		return xuongSx.getSoCongNhan();
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public double tinhLuongcn() {
		double luong;
		if (soNgayCong <= 0)
			return 0;
		else if (soNgayCong >= 23) {
			luong = soNgayCong * 250000 + 500000;
		} else if (soNgayCong >= 20) {
			luong = soNgayCong * 250000 + 300000;
		} else if (soNgayCong >= 18) {
			luong = soNgayCong * 250000;
		} else {
			luong = soNgayCong * 250000 - 200000;
		}
		return luong;
	}

	public static double tinhLuongCn() {
		return tinhLuongCn();
	}

	public void hienThicn() {
		System.out.printf("%4d", maNs);
		System.out.printf("%10s", ten);
		System.out.printf("%10d", namSinh);
		System.out.printf("%11s", gioiTinh);
		System.out.printf("%10s", xuongSx.getTenXuong());
		System.out.printf("%19s", xuongSx.getQuanDoc());
		System.out.printf("%7d", xuongSx.getSoCongNhan());
		System.out.printf("%15s", congViec);
		System.out.printf("%15d", soNgayCong);
		System.out.printf("%15s", tinhLuongcn());
		System.out.printf("%3s", "VNĐ");
	}

	public static void hienThiCn() {
		// TODO Auto-generated method stub

	}
}
