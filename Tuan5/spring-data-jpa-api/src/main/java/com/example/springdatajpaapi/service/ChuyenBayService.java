package com.example.springdatajpaapi.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.springdatajpaapi.entity.ChuyenBay;

public interface ChuyenBayService {
	
	
	List<ChuyenBay> findAllByGaDen(String gaDen);
	
	List<ChuyenBay> findCBByFromTo(String from, String to);

	int findCBByFrom(String from);

	List<ChuyenBay> findCBByDD(int from, int to);

	List<ChuyenBay> findAll();
}
