package com.example.SpringDataJPA.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class NhanVien {
	@Id
	@Column(columnDefinition = "varchar(9)", nullable = false)
	private String maNV;
	private String ten;
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<ChungNhan> lsChungNhan;
}
