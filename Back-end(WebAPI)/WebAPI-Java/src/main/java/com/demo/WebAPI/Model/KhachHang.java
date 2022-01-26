package com.demo.WebAPI.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MaKH")
	private int MaKH;
	
	@Column(name="TenKH")
	private String TenKH;
	
	@Column(name="NgaySinh")
	private String NgaySinh;
	
	@Column(name="SDT")
	private String SDT;
	
	@Column(name="DiaChi")
	private String DiaChi;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="CMND")
	private String CMND;
	
	@Column(name="MaLoaiKH")
	private int MaLoaiKH;
	
	@Column(name="TaiKhoan")
	private int TaiKhoan;
	
	public KhachHang() 
	{
		
	}
	
	public KhachHang(String TenKH, String NgaySinh, String SDT, String DiaChi, String Email, String CMND, int MaLoaiKH, int TaiKhoan) 
	{
		this.TenKH = TenKH;
		this.NgaySinh = NgaySinh;
		this.SDT = SDT;
		this.DiaChi = DiaChi;
		this.Email = Email;
		this.CMND = CMND;
		this.MaLoaiKH = MaLoaiKH;
		this.TaiKhoan = TaiKhoan;
	}
	
	public int getMaKH()
	{
		return MaKH;
	}
	
	public String getTenKH()
	{
		return TenKH;
	}
	
	public void setTenKH(String TenKH)
	{
		this.TenKH = TenKH;
	}
	
	public String getNgaySinh()
	{
		return NgaySinh;
	}
	
	public void setNgaySinh(String NgaySinh)
	{
		this.NgaySinh = NgaySinh;
	}
	
	public String getSDT()
	{
		return SDT;
	}
	
	public void setSDT(String SDT)
	{
		this.SDT = SDT;
	}
	
	public String getDiaChi()
	{
		return DiaChi;
	}
	
	public void setDiaChi(String DiaChi)
	{
		this.DiaChi = DiaChi;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getCMND()
	{
		return CMND;
	}
	
	public void setCMND(String CMND)
	{
		this.CMND = CMND;
	}
	
	public int getMaLoaiKH()
	{
		return MaLoaiKH;
	}
	
	public void setMaLoaiKH(int MaLoaiKH)
	{
		this.MaLoaiKH = MaLoaiKH;
	}
	
	public int getTaiKhoan()
	{
		return TaiKhoan;
	}
	
	public void setTaiKhoan(int TaiKhoan)
	{
		this.TaiKhoan = TaiKhoan;
	}
	
	@Override
	public String toString() {
		return "KhachHang [TenKH = " + TenKH + 
				", CMND =" + CMND +
				", DiaChi =" + DiaChi +
				", NgaySinh =" + NgaySinh +
				", SDT =" + SDT +
				", Email =" + Email +
				", MaLoaiKH =" + MaLoaiKH + 
				", TaiKhoan =" + TaiKhoan +"]";
	}

}
