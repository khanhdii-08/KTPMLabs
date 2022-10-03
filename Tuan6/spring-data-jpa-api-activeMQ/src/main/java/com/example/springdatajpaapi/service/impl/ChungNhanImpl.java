package com.example.springdatajpaapi.service.impl;

import com.example.springdatajpaapi.entity.ChungNhan;
import com.example.springdatajpaapi.repository.ChungNhanRepository;
import com.example.springdatajpaapi.service.ChungNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChungNhanImpl implements ChungNhanService {
    @Autowired
    private ChungNhanRepository chungNhanRepository;

    @Override
    public List<ChungNhan> findAll() {
        return chungNhanRepository.findAll();
    }
}
