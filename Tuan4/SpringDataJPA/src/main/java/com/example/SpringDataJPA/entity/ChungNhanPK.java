package com.example.SpringDataJPA.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class ChungNhanPK implements Serializable {
	private String nhanVien;
	private int mayBay;
}
