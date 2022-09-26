package com.example.SpringDataJPA.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@IdClass(ChungNhanPK.class)
@Table(name = "chungnhan")
@Data
public class ChungNhan {
	@Id
	@ManyToOne
	@JoinColumn(name = "maNV", foreignKey = @ForeignKey(name = "NhanVien_ID_FK"), columnDefinition = "varchar(9)")
	private NhanVien nhanVien;
	@Id
	@ManyToOne
	@JoinColumn(name = "maCB", foreignKey = @ForeignKey(name = "ChuyenBay_ID_FK"))
	private MayBay mayBay;
}
