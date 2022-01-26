package com.demo.WebAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.WebAPI.Model.TaiKhoan;
import com.demo.WebAPI.Repository.TaiKhoanRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaiKhoanController {
	@Autowired
	TaiKhoanRepository repo;
	
	@PostMapping("/taikhoan")
	public ResponseEntity<TaiKhoan> ThemTaiKhoan(@RequestBody TaiKhoan taikhoan) {
		try {
			TaiKhoan _taikhoan = repo.save(new TaiKhoan(taikhoan.getUsername(), taikhoan.getPassword(),
			taikhoan.getTrangThai(), taikhoan.getVaiTro()));
			return new ResponseEntity<>(_taikhoan, HttpStatus.CREATED);
			} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			}

	@GetMapping("/taikhoan")
	public ResponseEntity<List<TaiKhoan>> XemDanhSachTaiKhoan() {
	try {
	List<TaiKhoan> taikhoanlst = new ArrayList<TaiKhoan>();
	repo.findAll().forEach(taikhoanlst::add);
	if (taikhoanlst.isEmpty()) {
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<>(taikhoanlst, HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
