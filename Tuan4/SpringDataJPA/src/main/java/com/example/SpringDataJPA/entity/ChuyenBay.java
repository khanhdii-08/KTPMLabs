package com.example.SpringDataJPA.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    private String maCB;
    private String gaDi;
    private String gaDen;
    private int doDai;
    private Date gioDi;
    private Date gioDen;
    private int chiPhi;
}
