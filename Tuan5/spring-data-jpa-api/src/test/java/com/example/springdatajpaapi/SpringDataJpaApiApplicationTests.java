package com.example.springdatajpaapi;

import com.example.springdatajpaapi.entity.ChuyenBay;
import com.example.springdatajpaapi.entity.MayBay;
import com.example.springdatajpaapi.service.ChuyenBayService;
import com.example.springdatajpaapi.service.MayBayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApiApplicationTests {

	@Autowired
	private MayBayService mayBayService;

	@Autowired
	private ChuyenBayService chuyenBayService;

	@Test
	void contextLoads() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findCBByDD(8000, 10000);
		System.out.println(chuyenBayService.findAll());
		for (ChuyenBay s : chuyenBays){
			System.out.println(s);
		}
	}

}
