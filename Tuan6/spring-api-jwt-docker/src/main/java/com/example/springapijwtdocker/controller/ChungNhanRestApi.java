package com.example.springapijwtdocker.controller;

import com.example.springapijwtdocker.entity.ChungNhan;
import com.example.springapijwtdocker.service.ChungNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChungNhanRestApi {
    @Autowired
    private ChungNhanService chungNhanService;

    @GetMapping("/chung-nhan")
    public List<ChungNhan> findAll(){
        return chungNhanService.findAll();
    }
}
