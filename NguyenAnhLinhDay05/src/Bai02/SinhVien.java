package Bai02;

import java.util.Scanner;

import javax.rmi.CORBA.Tie;

public class SinhVien {

	public static Scanner in = new Scanner(System.in);
	private int maSV;
	private String hoDem;
	private String ten;
	private String namSinh;
	private String gioiTinh;

	private int n;
	static MonHoc[] MH = new MonHoc[10];

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
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

	public SinhVien(int maSV, String hoDem, String ten, String namSinh, String gioiTinh) {
		super();
		this.maSV = maSV;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	public SinhVien() {
		super();
	}

	public float DiemTK() {
		float S = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			S += MH[i].getDiemKetThucHP() * MH[i].getTinChi();
			t += MH[i].getTinChi();
		}
		return S / t;
	}

	public void Nhap() {

		System.out.println("--------NHẬP THÔNG TIN SINH VIÊN-------");
		System.out.printf("Nhập mã sinh viên:");
		maSV = in.nextInt();
		in.nextLine();
		System.out.printf("Nhập họ đệm:");
		hoDem = in.nextLine();
		System.out.printf("Nhập tên:");
		ten = in.nextLine();
		System.out.printf("Nhập năm sinh:");
		namSinh = in.nextLine();
		System.out.printf("Nhập giới tính:");
		gioiTinh = in.nextLine();
		System.out.println("--------NHẬP THÔNG TIN MÔN HỌC--------");
		System.out.printf("\tNhập số môn học:");
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			MH[i] = new MonHoc();
			System.out.println("\tNhập môn học thứ " + (i + 1) + ":");
			System.out.printf("Nhập mã học phần:");
			MH[i].setMaHP(in.nextInt());
			in.nextLine();
			System.out.printf("Nhập tên Học Phần:");
			MH[i].setTenHocPhan(in.nextLine());
			System.out.printf("Nhập số Tín Chỉ:");
			MH[i].setTinChi(in.nextInt());
			System.out.printf("Nhập điểm tổng kết:");
			MH[i].setDiemKetThucHP(in.nextFloat());
		}
	}

	public void XuatSV() {
		System.out.printf("%12d", maSV);
		System.out.printf("%8s", hoDem);
		System.out.printf("%7s", ten);
		System.out.printf("%10s", namSinh);
		System.out.printf("%12s", gioiTinh);

		System.out.println();
	}

	public void XuatMH() {
		for (int i = 0; i < n; i++) {
			System.out.printf("%10d", MH[i].getMaHP());
			System.out.printf("%10s", MH[i].getTenHocPhan());
			System.out.printf("%8d", MH[i].getTinChi());
			System.out.printf("%20f", MH[i].getDiemKetThucHP());
			System.out.println();
		}

	}

	public void setSinhVien() {
		System.out.println("------Sửa Thông Tin Sinh Viên-----");
		in.nextLine();
		System.out.printf("\tNhập tên :");
		String newName = in.nextLine();

		System.out.printf("\tNhập họ đệm :");
		String firstName = in.nextLine();
		System.out.printf("\tNhập năm sinh:");
		String newYears = in.nextLine();
		System.out.printf("\tNhập giới tính:");
		String newSex = in.nextLine();

		setGioiTinh(newSex);
		setHoDem(firstName);
		setNamSinh(newYears);
		setTen(newName);
		System.out.println();
		System.out.println("-------Thông Tin Sinh Viên Sau Khi Set------");
		titleSV();
		XuatSV();
	}

	public void setDiem() {
		int newCode, i = 0;
		do {
			System.out.printf("\tNhập mã học phần cần sửa:");
			newCode = in.nextInt();

			while (i < n) {
				if (MH[i].getMaHP() == newCode) {
					System.out.println("------Sửa Điểm, Tín chỉ của Sinh Viên-----");

					System.out.printf("\tNhập điểm:");
					float newMark = in.nextFloat();
					System.out.printf("\tNhập số tín chỉ mới:");
					int newCredit = in.nextInt();
					MH[i].setDiemKetThucHP(newMark);
					MH[i].setTinChi(newCredit);
					System.out.println("--------Điểm Sau Khi Set-----");
					titleMH();
					XuatMH();
					System.out.printf("\n Điểm TB%12f", DiemTK());

					return;

				} else {
					System.out.println("\tMã học phần không tồn tại");
					break;
				}

			}

		} while (true);
	}

	public static void titleSV() {
		System.out.printf("%12s", "Mã Sinh Viên");
		System.out.printf("%10s", "Họ Đệm");
		System.out.printf("%7s", "Tên");
		System.out.printf("%10s", "Năm Sinh");
		System.out.printf("%14s", "Giới Tính");
		System.out.println(" ");
	}

	public static void titleMH() {

		System.out.printf("%10s", "Mã HP");
		System.out.printf("%10s", "Tên HP");
		System.out.printf("%10s", "Số TC");
		System.out.printf("%24s", "Điểm kết thúc HP");
		System.out.println(" ");
	}
}
