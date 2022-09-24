package com.example.SpringDataJPA.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class ChuyenBay {
	@Id
	@Column(columnDefinition = "varchar(5)",nullable = false)
	private String maCB;
	private String gaDi;
	private String gaDen;
	private int doDai;
	private Time gioDi;
	private Time gioDen;
	private int chiphi;
	
}