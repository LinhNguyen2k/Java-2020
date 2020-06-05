package Bai03;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class RunMain {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.Nhap();
		sv.Xuat();
		System.out.println();
		System.out.println("\t-------------MENU-------------");
		System.out.println("\t\t1.Danh Sách Sinh Viên Có Điểm <6");
		System.out.println("\t\t2.Set Thông Tin Sinh Viên");
		System.out.println("\t\t3.Set Thông Tin Môn Học");
		System.out.println("\t\t0.Thoát");
		int chon;
		do {
			System.out.printf("\tMời bạn chọn 1 trong các chức năng trên:");
			chon = in.nextInt();
			switch (chon) {
			case 1: {
				sv.Function1();
				break;
			}
			case 2: {
				sv.Function2();
				break;
			}

			case 3: {
				sv.Function3();
				break;
			}

			case 0:
				return;
			
			default:
				{
					System.out.println("Bạn hãy chọn 1 or 2 or 3");
				}
			}
 
		} while (true);

	}

}
