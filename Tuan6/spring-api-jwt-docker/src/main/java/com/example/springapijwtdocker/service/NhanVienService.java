package com.example.springapijwtdocker.service;

import com.example.springapijwtdocker.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> findAll();
}
