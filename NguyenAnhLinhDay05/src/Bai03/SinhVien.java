package Bai03;

import java.util.Scanner;

public class SinhVien {
	 public static Scanner in = new Scanner(System.in);
	private String tenSinhVien;
	private int ngaySinh;
	private int thangSinh;
	private int namSinh;
	private int maSV;
	private String nganh;
	int n;
	MonHoc[] monhoc = new MonHoc[20];
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public SinhVien() {
		super();
	}
	public SinhVien(String tenSinhVien, int ngaySinh, int thangSinh, int namSinh, int maSV, String nganh) {
		super();
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.thangSinh = thangSinh;
		this.namSinh = namSinh;
		this.maSV = maSV;
		this.nganh = nganh;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public int getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getThangSinh() {
		return thangSinh;
	}
	public void setThangSinh(int thangSinh) {
		this.thangSinh = thangSinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public void Nhap()
	{
		System.out.println("--------NHẬP THÔNG TIN SINH VIÊN-------");
		System.out.printf("Nhập họ tên:");
		tenSinhVien = in.nextLine();
		System.out.printf("Nhập mã sinh viên:");
		maSV = in.nextInt();
		
		System.out.printf("Nhập ngày sinh:");
		ngaySinh = in.nextInt();
		System.out.printf("Nhập thang sinh:");
		thangSinh = in.nextInt();
		System.out.printf("Nhập năm sinh:");
		namSinh = in.nextInt();
		in.nextLine();
		System.out.printf("Nhập ngành:");
		nganh = in.nextLine();
		System.out.println("-----NHẬP THÔNG TIN MÔN HỌC-----");
        System.out.printf("\tNhập số môn học:");
        n = in.nextInt();
       
        for(int i=0;i<n;i++)
        {
        	monhoc[i] = new MonHoc();
        	System.out.println("\tNhập môn học thứ "+(i+1)+":");
        	monhoc[i].Nhap();
        }
		
	}
	public void Xuat()
	{
		System.out.println("\t\tBẢNG ĐIỂM CÁ NHÂN");
		System.out.println("Mã sinh viên:"+maSV+"\t\t"+"Họ và tên:"+tenSinhVien);
		System.out.println("Ngày sinh:"+ngaySinh+"/"+thangSinh+"/"+namSinh+"\t\t"+"Ngành:"+nganh);
		 titleMH();
		for(int i=0;i<n;i++)
		{
			System.out.printf("%4d",(i+1));
			monhoc[i].Xuat();
		}
		System.out.printf("\n Điểm TB%12f", DiemTK());

	}
	public void Function1()
	{
		int dem=0;
		System.out.println("------Danh sách sinh viên có điểm <6-----");
		for(int i=0;i<n;i++)
		{
			if(monhoc[i].getDiemHP() < 6)
			{
				monhoc[i].Xuat();
				dem++;
			}
		}
		if(dem==0)
		{
			System.out.println("---------Không có Sinh Viên có điểm < 6---------");
		}
	}
	public void Function2()
	{
		System.out.println("------Sửa Thông Tin Sinh Viên-----");
		in.nextLine();
		System.out.printf("\tNhập tên :");
		String newName = in.nextLine();
		System.out.printf("\tNhập ngay sinh:");
		int newDay = in.nextInt();
		System.out.printf("\tNhập thang sinh:");
		int newMonth = in.nextInt();
		System.out.printf("\tNhập năm sinh:");
		int newYear = in.nextInt();
		in.nextLine();
		System.out.printf("\tNhập ngành:");
		String newNganh = in.nextLine();
	
		setNgaySinh(newDay);
		setThangSinh(newMonth);
		setNamSinh(newYear);
		setTenSinhVien(newName);
		setNganh(newNganh);
		System.out.println("-------Thông Tin Sinh Viên Sau Khi Set------");
		System.out.println("Mã sinh viên:"+maSV+"\t\t"+"Họ và tên:"+tenSinhVien);
		System.out.println("Ngày sinh:"+ngaySinh+"/"+thangSinh+"/"+namSinh+"\t\t"+"Ngành:"+nganh);
		
	}
	
	public void Function3()
	{
		int newCode, i = 0;
		do {
			System.out.printf("\tNhập mã học phần cần sửa:");
			newCode = in.nextInt();

			while (i < n) {
				if (monhoc[i].getMaHP() == newCode) {
					System.out.println("------Sửa Điểm, Tín chỉ của Sinh Viên-----");
                    
					System.out.printf("\tNhập điểm:");
					float newMark = in.nextFloat();
					System.out.printf("\tNhập số tín chỉ mới:");
					int newCredit = in.nextInt();
					in.nextLine();
					 System.out.printf("Nhập tên học phần:");
                     String newName = in.nextLine();
					monhoc[i].setDiemHP(newMark);
					monhoc[i].setSoTC(newCredit);
					monhoc[i].setTenHP(newName);
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
	public float DiemTK() {
		float S = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			S += monhoc[i].getDiemHP() * monhoc[i].getSoTC();
			t += monhoc[i].getSoTC();
		}
		return S / t;
	}
	public static void titleMH() {
        System.out.printf("%4s","STT");
		System.out.printf("%13s", "Mã HP");
		System.out.printf("%13s", "Tên HP");
		System.out.printf("%13s", "Số TC");
		System.out.printf("%13s", "Điểm HP");
		System.out.println(" ");
	}
	public void XuatMH() {
		for (int i = 0; i < n; i++) {
			System.out.printf("%4d",(i+1));
			System.out.printf("%12d", monhoc[i].getMaHP());
			System.out.printf("%12s", monhoc[i].getTenHP());
			System.out.printf("%12d", monhoc[i].getSoTC());
			System.out.printf("%12f", monhoc[i].getDiemHP());
			System.out.println();
		}

	}
}
