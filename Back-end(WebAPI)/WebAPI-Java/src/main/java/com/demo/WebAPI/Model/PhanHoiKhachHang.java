package com.demo.WebAPI.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhanHoiKhachHang")
public class PhanHoiKhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="TenKH")
	private String tenkh;
	
	@Column(name="PhanHoi")
	private String phanhoi;
	
	@Column(name="ThoiGian")
	private String thoigian;
	
	public PhanHoiKhachHang() 
	{
		
	}
	
	public PhanHoiKhachHang(String username, String tenkh, String phanhoi, String thoigian) 
	{
		this.username = username;
		this.tenkh = tenkh;
		this.phanhoi = phanhoi;
		this.thoigian = thoigian;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String Username)
	{
		this.username = Username;
	}
	
	public String getTenKH()
	{
		return tenkh;
	}
	
	public void setTenKH(String tenKH)
	{
		this.tenkh = tenKH;
	}
	
	public String getPhanHoi()
	{
		return phanhoi;
	}
	
	public void setPhanHoi(String phanHoi)
	{
		this.phanhoi = phanHoi;
		
	}
	
	
	public String getThoiGian()
	{
		return thoigian;
	}
	
	public void setThoiGian(String thoiGian)
	{
		this.thoigian = thoiGian;
		
	}
		@Override
		public String toString() {
			return "PhanHoiKhachHang [Username = " + username + 
					", TenKH =" + tenkh + 
					", ThoiGian =" + thoigian + 
					", PhanHoi =" + phanhoi +"]";
	}
	
}
