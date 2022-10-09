package com.example.springapijwtdocker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "chuyenbay")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChuyenBay {
    @Id
    @Column(columnDefinition = "varchar(5)")
    private String macb;
    private String gadi;
    private String gaden;
    private int dodai;
    private Time giodi;
    private Time gioden;
    private int chiphi;
}
