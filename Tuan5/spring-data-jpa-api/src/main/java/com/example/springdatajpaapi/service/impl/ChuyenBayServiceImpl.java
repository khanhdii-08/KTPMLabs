package com.example.springdatajpaapi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpaapi.entity.ChuyenBay;
import com.example.springdatajpaapi.repository.ChuyenBayRepository;
import com.example.springdatajpaapi.service.ChuyenBayService;

@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService{

	@Override
	public List<ChuyenBay> findAll() {
		return chuyenBayRepository.findAll();
	}

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> findAllByGaDen(String gaDen) {
		
		return chuyenBayRepository.findAllByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findCBByFromTo(String from, String to) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findCBByFromTo(from, to);
	}

	@Override
	public List<ChuyenBay> findCBByFrom(String from) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findCBByFrom(from);
	}

}
