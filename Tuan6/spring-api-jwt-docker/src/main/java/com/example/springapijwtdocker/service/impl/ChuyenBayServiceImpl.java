package com.example.springapijwtdocker.service.impl;

import com.example.springapijwtdocker.entity.ChuyenBay;
import com.example.springapijwtdocker.repository.ChuyenBayRepository;
import com.example.springapijwtdocker.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<ChuyenBay> findAll() {
        return chuyenBayRepository.findAll();
    }
}
