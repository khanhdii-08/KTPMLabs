package com.example.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDataJPA.entity.ChungNhan;
import com.example.SpringDataJPA.entity.ChungNhanPK;

public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>{

}
