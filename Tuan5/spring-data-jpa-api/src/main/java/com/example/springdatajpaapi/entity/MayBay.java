package com.example.springdatajpaapi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "maybay")
@Data
public class MayBay {
	@Id
	private int maMB;
	private String loai;
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay")
	private List<ChungNhan> lsChungNhan;
}
