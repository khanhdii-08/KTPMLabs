package com.example.springdatajpaapi.controller;

import com.example.springdatajpaapi.entity.NhanVien;
import com.example.springdatajpaapi.repository.NhanVienRepository;
import com.example.springdatajpaapi.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NhanVienRestApi {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/nhan-vien/luong")
    public List<NhanVien> findAllByLuong(@RequestParam(value = "luong", required = true)int luong){
        return nhanVienService.findAllByLuong(luong);
    }
}
