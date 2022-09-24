package com.example.SpringDataJPA.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MayBay {
	@Id
	private int maMB;
	private String loai;
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay")
	private List<ChungNhan> lsChungNhan;
}
