package com.example.SpringDataJPA.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChungNhan {
    @Id
    @ManyToOne
    @JoinColumn(name = "maNV")
    private String maNV;

    @Id
    @ManyToOne
    @JoinColumn(name = "maMB")
    private int maMB;
}
