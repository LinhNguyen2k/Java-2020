package devpro.vn;

import java.lang.StackOverflowError;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class RunMain {
	static Scanner input = new Scanner(System.in);
	static NhanSu[] ns = new NhanSu[6];

	public static void main(String[] args) {
		ns[0] = new CanBo(101, "Nguyễn Anh", "Linh", 2000, "Nam", new Phong("126", "An Văn Minh"), "Giám đốc", 3.4,
				"A");

		ns[1] = new CongNhan(201, "Nguyễn Văn", "Mạnh", 2000, "Nam", new XuongSX("OTO", "An Văn Minh", 3), "Bảo Vệ",
				23);
		ns[2] = new CanBo(102, "Nguyễn Thị", "Hà", 2000, "Nữ", new Phong("418", "An Văn Minh"), "Thư kí", 2, "A");
		ns[3] = new CongNhan(202, "Đỗ Vinh", "Hà", 2000, "Nam", new XuongSX("OTO", "An Văn Minh", 3), "  lắp đặt",
				20);
		ns[4] = new CongNhan(203, "Nguyễn Thị", "Linh", 2000, "Nữ", new XuongSX("OTO", "An Văn Minh", 3), "Thu Ngân",
				19);
		ns[5] = new CanBo(103, "Vũ Văn ", "Doan", 2000, "Nam", new Phong("372", "An Văn Minh"), "Nhân viên", 1.5, "D");
		System.out.println("---------------------------------MENU CHƯƠNG TRÌNH---------------------------------");
		System.out.println("\t0:Thoát chương trình!");
		System.out.println("\t1:Hiển thị danh sách nhân sự. ");
		System.out.println("\t2:Hiển thị danh sách công nhân nam. ");
		System.out.println("\t3:Hiển thị danh sách cán bộ nữ.");
		System.out.println("\t4:Hiển thị danh sách cán bộ có lương cao nhất. ");
		System.out.println("\t5:Hiển thị danh sách công nhân có lương thấp nhất.");
		System.out.println("\t6:Tínhtổng salary của tất cả các cán bộ và hiển thị kết quả. ");
		System.out.println("\t7:Tínhtổng salary của tất cả công nhân, hiển thị kết quả.");
		System.out.println("\t8:Chuyển các công nhân xuống cuối danh sách, hiển thị danh sách. ");
		System.out.println("\t9: Sắp xếp danh sách nhân sự theo chiều tăng dần của tên.\n" + "");
		int BaiTap;
		do {
			System.out.println();
			System.out.println("Bạn chọn gì?");
			BaiTap = input.nextInt();
			switch (BaiTap) {
			case 1:
				function1();
				break;
			case 2:
				function2();
				break;
			case 3:
				function3();
				break;
			case 4:
				function4();
				break;
			case 5:
				function5();
				break;
			case 6:
				function6();
				break;
			case 7:
				function7();
				break;
			case 8:
				function8();
				break;
			case 9:
				function9();
				break;
			case 0:
				System.out.println("Chương trình đã thoát");
				return;
			}
		} while (true);
	}

	public static void title() {
		System.out.printf("%-5s", "Mã NS");
		System.out.printf("\t%-8s", "Tên");
		System.out.printf("%-8s", "Năm Sinh");
		System.out.printf("\t%-8s", "Gtính");
	}

	public static void titlecb() {
		System.out.printf("%-5s", "Phòng");
		System.out.printf("%19s", "Trưởng Phòng");
		System.out.printf("%14s", "Chức vụ");
		System.out.printf("%17s", "Hsố lương");
		System.out.printf("%12s", "Xếp loại");
		System.out.printf("%12s", "Lương");
	}

	public static void titlecn() {
		System.out.printf("%-5s", "Xưởng");
		System.out.printf("%15s", "Q.đốc");
		System.out.printf("%12s", "Số CN");
		System.out.printf("%15s", "Công việc");
		System.out.printf("%15s", "Số ngày công");
		System.out.printf("%18s", "Lương");
	}

	public static void function1() {
		System.out.println();
		System.out.println("\t\t\t-------------------DANH SÁCH CÁN BỘ-------------------\n");
		title();
		titlecb();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CanBo) {
				ns[i].hienThicb();
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("\t\t\t-------------------DANH SÁCH CÔNG NHÂN-------------------\n");
		title();
		titlecn();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CongNhan) {
				ns[i].hienThicn();
				System.out.println();
			}
		}

	}

	public static void function2() {
		System.out.println("\t\t---------------DANH SÁCH CÔNG NHÂN NAM----------------\n");
		title();
		titlecn();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if ((ns[i] instanceof CongNhan) && (ns[i].getGioiTinh() == "Nam")) {
				ns[i].hienThicn();
				System.out.println();
			}
		}

	}

	public static void function3() {
		System.out.println("\t\t-------------------DANH SÁCH CÁN BỘ NỮ------------------\n");
		title();
		titlecb();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if ((ns[i] instanceof CanBo) && (ns[i].getGioiTinh() == "Nữ")) {
				ns[i].hienThicb();
				System.out.println();
			}
		}
	}

	public static void function4() {
		System.out.println("\t\t----------------------DANH SÁCH CÁN BỘ CÓ LƯƠNG CAO NHẤT-------------------\n");
		int i;
		double max = 0;
		for (i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CanBo) {
				max = ns[i].tinhLuongcb();
				break;
			}
		}
		for (int j = 0; j < ns.length; j++) {
			if ((ns[j] instanceof CanBo) && (ns[j].tinhLuongcb() > max)) {
				max = ns[j].tinhLuongcb();

			}
		}

		title();
		titlecb();
		System.out.println();
		for (int k = 0; k < ns.length; k++) {
			if ((ns[k] instanceof CanBo) && (ns[k].tinhLuongcb() == max)) {
				ns[k].hienThicb();
			}
		}
	}

	public static void function5() {
		System.out.println("\t\t-----------------DANH SÁCH CÔNG NHÂN CÓ LƯƠNG THẤP NHẤT-----------------\t");
		int i;
		double min = 0;
		for (i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CongNhan) {
				min = ns[i].tinhLuongcn();
				break;
			}
		}
		for (int j = 0; j < ns.length; j++) {
			if ((ns[j] instanceof CongNhan) && (ns[j].tinhLuongcn() < min)) {
				min = ns[j].tinhLuongcn();

			}
		}
		title();
		titlecn();
		System.out.println();
		for (int k = 0; k < ns.length; k++) {
			if ((ns[k] instanceof CongNhan) && (ns[k].tinhLuongcn() == min)) {
				ns[k].hienThicn();
			}
		}
	}

	public static void function6() {
		System.out.print("\t\tTỔNG SALARY CỦA TẤT CẢ CÁC CÁN BỘ: ");
		double tong = 0;
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CanBo) {
				tong += ns[i].tinhLuongcb();
			}
		}
		System.out.printf("%10.2f", tong);
		System.out.printf("%3s", "VNĐ");
	}

	public static void function7() {
		System.out.print("\t\tTỔNG SALARY CỦA TẤT CẢ CÁC CÔNG NHÂN: ");
		double tong = 0;
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CongNhan) {
				tong += ns[i].tinhLuongcn();
			}
		}
		System.out.printf("%10.2f", tong);
		System.out.printf("%3s", "VNĐ");
	}

	public static void function8() {
		System.out.println("\t\t--------------CHUYỂN CÔNG NHÂN XUỐNG CUỐI-----------------\n");
		title();
		titlecb();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CanBo) {
				ns[i].hienThicb();
				System.out.println();
			}
		}
		System.out.println();
		title();
		titlecn();
		System.out.println();
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] instanceof CongNhan) {
				ns[i].hienThicn();
				System.out.println();
			}
		}
	}

	public static void function9() {
		System.out.println("\t\t---------------SẮP XẾP THEO CHIỀU TĂNG CỦA TÊN--------------------\n");
		for (int i = 0; i < ns.length; i++) {
			for (int j = i + 1; j < ns.length; j++) {
				if (ns[i].getTen().compareTo(ns[j].getTen()) > 0) {
					NhanSu nstg = ns[i];
					ns[i] = ns[j];
					ns[j] = nstg;
				}
			}
		}
		function1();
	}
}
