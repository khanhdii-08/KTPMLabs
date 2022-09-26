package com.example.springdatajpaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpaapi.entity.ChuyenBay;
import com.example.springdatajpaapi.repository.ChuyenBayRepository;
import com.example.springdatajpaapi.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayRestApi {
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyen-bay")
	public List<ChuyenBay> findAll(){
		return chuyenBayService.findAll();
	}
	
	
	//Cau 1
	@GetMapping("/chuyen-bay/ga-den")
	public List<ChuyenBay> findAllByGaDen(@RequestParam(value="name", required=true) String name){
		return chuyenBayService.findAllByGaDen(name);
	}

}
