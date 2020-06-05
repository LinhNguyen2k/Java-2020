package Bai03;

import java.util.Scanner;

public class MonHoc {
  public static Scanner in = new Scanner(System.in);
	private int maHP;
	private String tenHP;
	private int soTC;
	private float diemHP;
	public int getMaHP() {
		return maHP;
	}
	public void setMaHP(int maHP) {
		this.maHP = maHP;
	}
	public String getTenHP() {
		return tenHP;
	}
	public void setTenHP(String tenHP) {
		this.tenHP = tenHP;
	}
	public int getSoTC() {
		return soTC;
	}
	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}
	public float getDiemHP() {
		return diemHP;
	}
	public void setDiemHP(float diemHP) {
		this.diemHP = diemHP;
	}
	public MonHoc() {
		super();
	}
	public MonHoc(int maHP, String tenHP, int soTC, float diemHP) {
		super();
		this.maHP = maHP;
		this.tenHP = tenHP;
		this.soTC = soTC;
		this.diemHP = diemHP;
	}
	public void Nhap()
	{
		System.out.printf("Nhập tên học phần:");
		tenHP = in.nextLine();
		System.out.printf("Nhập mã học phần:");
		maHP = in.nextInt();
		
		System.out.printf("Nhập số tín chỉ:");
		soTC = in.nextInt();
		System.out.printf("Nhập điểm học phần:");
		diemHP = in.nextFloat();
		in.nextLine();
	}
	
	public void Xuat()
	{
		System.out.printf("%12d",maHP);
		System.out.printf("%13s",tenHP);
		System.out.printf("%12d",soTC);
		System.out.printf("%13f",diemHP);
		System.out.println();
	}
}
