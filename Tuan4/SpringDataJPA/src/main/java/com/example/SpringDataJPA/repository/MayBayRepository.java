package com.example.SpringDataJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJPA.entity.ChuyenBay;
import com.example.SpringDataJPA.entity.MayBay;

@Repository
@Transactional
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	// 2
	@Query(value="select * from maybay where tam_bay > ?1", nativeQuery = true)
	List<MayBay> findAllLoaiByTamBay(int tamBay);
}
