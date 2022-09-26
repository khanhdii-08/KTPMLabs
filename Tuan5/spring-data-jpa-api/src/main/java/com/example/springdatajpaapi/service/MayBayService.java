package com.example.springdatajpaapi.service;

import java.util.List;

import com.example.springdatajpaapi.entity.MayBay;

public interface MayBayService {
	List<MayBay> findAllLoaiByTamBay(int tamBay);

	List<MayBay> findAll();
}
