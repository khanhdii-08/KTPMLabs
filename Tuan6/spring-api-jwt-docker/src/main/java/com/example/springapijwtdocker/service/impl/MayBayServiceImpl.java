package com.example.springapijwtdocker.service.impl;

import com.example.springapijwtdocker.entity.MayBay;
import com.example.springapijwtdocker.repository.MayBayRepository;
import com.example.springapijwtdocker.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MayBayServiceImpl implements MayBayService {
    @Autowired
    private MayBayRepository mayBayRepository;

    @Override
    public List<MayBay> findAll() {
        return mayBayRepository.findAll();
    }
}
