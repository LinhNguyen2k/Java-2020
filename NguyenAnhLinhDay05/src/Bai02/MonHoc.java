package Bai02;

import java.util.Scanner;

public class MonHoc {

	public static Scanner in = new Scanner(System.in);
	private int maHP;
	private String tenHocPhan;
	private int tinChi;
	private float diemKetThucHP;

	public String getTenHocPhan() {
		return tenHocPhan;
	}

	public void setTenHocPhan(String tenHocPhan) {
		this.tenHocPhan = tenHocPhan;
	}

	public int getTinChi() {
		return tinChi;
	}

	public void setTinChi(int tinChi) {
		this.tinChi = tinChi;
	}

	public float getDiemKetThucHP() {
		return diemKetThucHP;
	}

	public void setDiemKetThucHP(float diemKetThucHP) {
		this.diemKetThucHP = diemKetThucHP;
	}

	public int getMaHP() {
		return maHP;
	}

	public void setMaHP(int maHP) {
		this.maHP = maHP;
	}

	public MonHoc() {
		super();
	}

	public MonHoc(int maHP, String tenHocPhan, int tinChi, float diemKetThucHP) {
		super();
		this.maHP = maHP;
		this.tenHocPhan = tenHocPhan;
		this.tinChi = tinChi;
		this.diemKetThucHP = diemKetThucHP;
	}

}
