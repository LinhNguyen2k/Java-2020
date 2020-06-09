package Bai01;

public class Teacher extends Employee {
	Subject subject;
	private double coefficientsSalary;
	private double salary;
	private int numberOfTeachingHours;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfTeachingHours() {
		return numberOfTeachingHours;
	}

	public void setNumberOfTeachingHours(int numberOfTeachingHours) {
		this.numberOfTeachingHours = numberOfTeachingHours;
	}

	public Teacher(Subject subject, double coefficientsSalary, double salary, int numberOfTeachingHours) {
		super();
		this.subject = subject;
		this.coefficientsSalary = coefficientsSalary;
		this.salary = salary;
		this.numberOfTeachingHours = numberOfTeachingHours;
	}

	public Teacher() {
		super();
	}

	public void input() {
		subject = new Subject();
		System.out.println("-----Nhập Thông Tin Subject-----");
		System.out.printf("\tNhâp code subject:");
		subject.setCode(in.nextInt());
		in.nextLine();
		System.out.printf("\tNhập name subject:");
		subject.setName(in.nextLine());
		System.out.println("-----Nhập Thông Tin of Teacher-----");
		System.out.printf("\tNhập hệ số lương:");
		coefficientsSalary = in.nextDouble();
		System.out.printf("\tNhập số giờ dạy:");
		numberOfTeachingHours = in.nextInt();
		super.input();

	}

	public void output() {
		super.output();
		System.out.printf("%15d", subject.getCode());
		System.out.printf("%15s", subject.getName());
		System.out.printf("%19f", coefficientsSalary);
		System.out.printf("%20.2f", calcuSalary());
		System.out.printf("%14d", numberOfTeachingHours);
		System.out.println();

	}

	public double calcuSalary() {
		salary = coefficientsSalary * 1150000 + numberOfTeachingHours * 60000;
		return salary;
	}

	public static void title() {
		System.out.printf("%5s", "STT");
		System.out.printf("%10s", "Mã NV");
		System.out.printf("%10s", "Surname");
		System.out.printf("%10s", "Name");
		System.out.printf("%17s", "YearWorking");
		System.out.printf("%20s", "Day/Month/Year");
		System.out.printf("%15s", "Mã Subject");
		System.out.printf("%15s", "Name Subject");
		System.out.printf("%19s", "Hệ số Lương");
		System.out.printf("%15s", "Lương");
		System.out.printf("%22s", "Số Giờ Dạy");
		System.out.println();

	}
}
