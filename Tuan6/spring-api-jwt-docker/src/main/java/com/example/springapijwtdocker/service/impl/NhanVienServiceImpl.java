package com.example.springapijwtdocker.service.impl;

import com.example.springapijwtdocker.entity.NhanVien;
import com.example.springapijwtdocker.repository.NhanVienRepository;
import com.example.springapijwtdocker.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }
}
