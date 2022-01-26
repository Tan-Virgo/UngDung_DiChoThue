package com.demo.WebAPI.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="TrangThai")
	private String trangthai;
	
	@Column(name="VaiTro")
	private String vaitro;
	
	public TaiKhoan() 
	{
		
	}
	
	public TaiKhoan(String username, String password, String trangthai, String vaitro) 
	{
		this.username = username;
		this.password = password;
		this.trangthai = trangthai;
		this.vaitro = vaitro;
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
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String Password)
	{
		this.password = Password;
	}
	
	public String getTrangThai()
	{
		return trangthai;
	}
	
	public void setTrangThai(String Trangthai)
	{
		this.trangthai = Trangthai;
	}
	
	public String getVaiTro()
	{
		return vaitro;
	}
	
	public void setVaiTro(String Vaitro)
	{
		this.vaitro = Vaitro;
	}
	
	@Override
	public String toString() {
		return "TaiKhoan [Username = " + username + 
				", Password =" + password +
				", TrangThai =" + trangthai + 
				", VaiTro =" + vaitro +"]";
	}

}

