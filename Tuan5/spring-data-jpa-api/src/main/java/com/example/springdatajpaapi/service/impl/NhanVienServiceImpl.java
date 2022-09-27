package com.example.springdatajpaapi.service.impl;

import com.example.springdatajpaapi.entity.NhanVien;
import com.example.springdatajpaapi.repository.NhanVienRepository;
import com.example.springdatajpaapi.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhanVienServiceImpl implements  NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> findAllByLuong(int luong) {
        return nhanVienRepository.findAllByLuong(luong);
    }
}
