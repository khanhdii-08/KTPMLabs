package com.example.springdatajpaapi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springdatajpaapi.entity.ChuyenBay;


@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{

	//1 
	@Query(nativeQuery = true, value = "select * from chuyenbay where ga_den = ?1")
	List<ChuyenBay> findAllByGaDen(String gaDen);
	
	//4
	@Query(nativeQuery = true, value = "select * from chuyenbay where do_dai > ?1 and do_dai < ?2")
	List<ChuyenBay> findCBByDD(int from, int to);
	
	//5
	@Query(nativeQuery = true, value = "select * from chuyenbay where ga_di = ?1 and ga_den = ?2")
	List<ChuyenBay> findCBByFromTo(String from, String to);
	
	//6
	@Query(nativeQuery = true, value = "select count(*) from chuyenbay where ga_di = ?1 ")
	int findCBByFrom(String from);
}
