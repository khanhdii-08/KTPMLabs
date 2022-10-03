package com.example.springdatajpaapi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpaapi.entity.MayBay;
import com.example.springdatajpaapi.repository.MayBayRepository;
import com.example.springdatajpaapi.service.MayBayService;

@Service
@Transactional
public class MayBayServiceImpl implements MayBayService{

	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Override
	public List<MayBay> findAll() {
		return mayBayRepository.findAll();
	}

	@Override
	public List<String> findAllLoaiByTamBay(int tamBay) {
		// TODO Auto-generated method stub
		return mayBayRepository.findAllLoaiByTamBay(tamBay);
	}

}
