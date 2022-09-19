package com.example.SpringDataJPA.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    private String maNV;
    private String ten;
    private int luong;

    @OneToMany(mappedBy = "nhanvien", cascade =  CascadeType.ALL)
    private List<ChungNhan> listChungNhan;

}
