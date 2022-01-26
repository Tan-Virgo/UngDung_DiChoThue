package com.demo.WebAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.WebAPI.Model.PhanHoiKhachHang;
import com.demo.WebAPI.Repository.PhanHoiRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class PhanHoiController {
	@Autowired
	PhanHoiRepository repo;
	@PostMapping("/phanhoi")
	public ResponseEntity<PhanHoiKhachHang> ThemPhanHoi(@RequestBody PhanHoiKhachHang phanhoi) {
		try {
			PhanHoiKhachHang _phanhoi = repo.save(new PhanHoiKhachHang(phanhoi.getUsername(), 
			phanhoi.getTenKH(), phanhoi.getPhanHoi(), phanhoi.getThoiGian()));
			return new ResponseEntity<>(_phanhoi, HttpStatus.CREATED);
			} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			}
	
	@GetMapping("/phanhoi")
	public ResponseEntity<List<PhanHoiKhachHang>> XemPhanHoi() {
	try {
	List<PhanHoiKhachHang> phanhoilst = new ArrayList<PhanHoiKhachHang>();
	repo.findAll().forEach(phanhoilst::add);
	if (phanhoilst.isEmpty()) {
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<>(phanhoilst, HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
}
