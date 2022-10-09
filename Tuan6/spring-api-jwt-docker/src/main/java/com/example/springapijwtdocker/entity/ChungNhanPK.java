package com.example.springapijwtdocker.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChungNhanPK implements Serializable {
    private String nhanVien;
    private int mayBay;

}
