package com.example.springapijwtdocker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NhanVien {
    @Id
    @Column(columnDefinition = "varchar(9)")
    private String manv;
    private String ten;
    private int luong;
}
