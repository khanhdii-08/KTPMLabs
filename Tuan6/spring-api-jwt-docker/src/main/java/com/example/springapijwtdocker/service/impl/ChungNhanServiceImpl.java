package com.example.springapijwtdocker.service.impl;

import com.example.springapijwtdocker.entity.ChungNhan;
import com.example.springapijwtdocker.repository.ChungNhanRepository;
import com.example.springapijwtdocker.service.ChungNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChungNhanServiceImpl implements ChungNhanService {

    @Autowired
    private ChungNhanRepository chungNhanRepository;

    @Override
    public List<ChungNhan> findAll() {
        return chungNhanRepository.findAll();
    }
}
