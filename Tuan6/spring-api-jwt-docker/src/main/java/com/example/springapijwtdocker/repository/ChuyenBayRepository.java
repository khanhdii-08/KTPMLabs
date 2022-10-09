package com.example.springapijwtdocker.repository;

import com.example.springapijwtdocker.entity.ChuyenBay;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
}
