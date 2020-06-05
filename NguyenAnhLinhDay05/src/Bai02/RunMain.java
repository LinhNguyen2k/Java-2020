package Bai02;

import java.util.Scanner;

public class RunMain {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();

		sv.Nhap();
		titleSV();
		sv.XuatSV();
		titleMH();
		sv.XuatMH();
		System.out.printf("\n Điểm TB%12f", sv.DiemTK());
		System.out.println();

		sv.setSinhVien();

		sv.setDiem();

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
