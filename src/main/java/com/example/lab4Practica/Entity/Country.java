package com.example.lab4Practica.Entity;

import javax.persistence.*;

@Entity
@Table(name="countries")

public class Country {

    @Id
    @Column(name = "country_id")
    private String id;
    @Column(name = "country_name")
    private String countryname;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regionid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Region getRegionid() {
        return regionid;
    }

    public void setRegionid(Region regionid) {
        this.regionid = regionid;
    }
}
