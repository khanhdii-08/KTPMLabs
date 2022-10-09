package com.example.springapijwtdocker.repository;

import com.example.springapijwtdocker.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
}
