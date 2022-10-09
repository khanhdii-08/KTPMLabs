package com.example.springapijwtdocker.repository;

import com.example.springapijwtdocker.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
