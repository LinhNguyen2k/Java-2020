package Bai02;

public class XuongSX {

	private String tenXuong;
	private String quanDoc;
	private String soCongNhan;
	public String getTenXuong() {
		return tenXuong;
	}
	public void setTenXuong(String tenXuong) {
		this.tenXuong = tenXuong;
	}
	public String getQuanDoc() {
		return quanDoc;
	}
	public void setQuanDoc(String quanDoc) {
		this.quanDoc = quanDoc;
	}
	public String getSoCongNhan() {
		return soCongNhan;
	}
	public void setSoCongNhan(String soCongNhan) {
		this.soCongNhan = soCongNhan;
	}
	public XuongSX(String tenXuong, String quanDoc, String soCongNhan) {
		super();
		this.tenXuong = tenXuong;
		this.quanDoc = quanDoc;
		this.soCongNhan = soCongNhan;
	}
	public XuongSX() {
		super();
	}
	
}
