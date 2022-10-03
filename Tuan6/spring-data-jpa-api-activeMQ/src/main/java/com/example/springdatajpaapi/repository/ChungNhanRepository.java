package com.example.springdatajpaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpaapi.entity.ChungNhan;
import com.example.springdatajpaapi.entity.ChungNhanPK;


public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>{

}
