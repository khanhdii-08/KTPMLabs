package com.example.springapijwtdocker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MayBay {
    @Id
    private int mamb;
    private String loai;
    private int tambay;
}
