package com.example.springdatajpaapi.controller;

import java.util.List;

import com.example.springdatajpaapi.repository.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpaapi.entity.MayBay;
import com.example.springdatajpaapi.service.MayBayService;

@RestController
@RequestMapping("/api")
public class MayBayRestApi {
	
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/may-bay")
	public List<MayBay> findAll(){
		return mayBayService.findAll();
	}

	//Cau 2
	@GetMapping("/may-bay/loai")
	public List<String> findAllLoaiByTamBay(@RequestParam(value = "tam-bay", required = true) int tamBay){
		return mayBayService.findAllLoaiByTamBay(tamBay);
	}
}
