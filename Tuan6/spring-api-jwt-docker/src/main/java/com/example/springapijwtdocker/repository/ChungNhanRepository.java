package com.example.springapijwtdocker.repository;

import com.example.springapijwtdocker.entity.ChungNhan;
import com.example.springapijwtdocker.entity.ChungNhanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK> {

}
