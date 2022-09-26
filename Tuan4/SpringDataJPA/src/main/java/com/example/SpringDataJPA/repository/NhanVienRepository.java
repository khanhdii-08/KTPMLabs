package com.example.SpringDataJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJPA.entity.NhanVien;

@Repository
@Transactional
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	
	//3
	@Query(value = "select * from nhanvien where luong < ?1", nativeQuery = true)
	List<NhanVien> findAllByLuong(int luong);
}
