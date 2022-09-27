package com.example.springdatajpaapi.service;

import com.example.springdatajpaapi.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> findAllByLuong(int luong);
}
