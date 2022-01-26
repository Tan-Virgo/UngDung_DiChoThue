package com.demo.WebAPI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.WebAPI.Model.KhachHang;
import com.demo.WebAPI.Repository.KhachHangRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class KhachHangController {
	@Autowired
	KhachHangRepository repo;
	
	@PostMapping("/khachhang")
	public ResponseEntity<KhachHang> ThemKhachHang(@RequestBody KhachHang khachhang) {
		try {
			KhachHang _khachhang = repo.save(new KhachHang(khachhang.getTenKH(), khachhang.getNgaySinh(),
			khachhang.getSDT(), khachhang.getDiaChi(), khachhang.getEmail(), khachhang.getCMND(), khachhang.getMaLoaiKH(), khachhang.getTaiKhoan()));
			return new ResponseEntity<>(_khachhang, HttpStatus.CREATED);
			} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			}
	
	@GetMapping("/khachhang")
	public ResponseEntity<List<KhachHang>> XemDanhSachKH() {
	try {
	List<KhachHang> KhachHanglst = new ArrayList<KhachHang>();
	repo.findAll().forEach(KhachHanglst::add);
	if (KhachHanglst.isEmpty()) {
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<>(KhachHanglst, HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

}
