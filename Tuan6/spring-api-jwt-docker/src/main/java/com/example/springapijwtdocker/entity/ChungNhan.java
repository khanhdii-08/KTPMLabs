package com.example.springapijwtdocker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChungNhan {
    @Id
    @ManyToOne
    @JoinColumn(name = "manv", columnDefinition = "varchar(9)", foreignKey = @ForeignKey(name = "NhanVien_ID_FK"))
    private NhanVien nhanVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "mamb", foreignKey = @ForeignKey(name = "MayBay_ID_FK"))
    private MayBay mayBay;
}
