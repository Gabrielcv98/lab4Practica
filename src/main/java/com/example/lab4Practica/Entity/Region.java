package com.example.lab4Practica.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {

    @Id
    @Column(name = "region_id")
    private int id;
    @Column(name = "region_name")
    private String regioname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegioname() {
        return regioname;
    }

    public void setRegioname(String regioname) {
        this.regioname = regioname;
    }
}
