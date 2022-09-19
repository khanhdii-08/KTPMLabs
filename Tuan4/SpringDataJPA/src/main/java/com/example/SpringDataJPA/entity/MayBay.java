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
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "maybay")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MayBay {
    @Id
    private int maMB;
    private String loai;
    private int tamBay;

    @OneToMany(mappedBy = "maybay", cascade = CascadeType.ALL)
    List<ChungNhan> listChungNhan;

}
