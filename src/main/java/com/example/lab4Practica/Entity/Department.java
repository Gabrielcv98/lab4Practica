package com.example.lab4Practica.Entity;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @Column(name = "department_id")
    private int id;
    @Column(name = "department_name")
    private String departmentname;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee managerid;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location locationid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Employee getManagerid() {
        return managerid;
    }

    public void setManagerid(Employee managerid) {
        this.managerid = managerid;
    }

    public Location getLocationid() {
        return locationid;
    }

    public void setLocationid(Location locationid) {
        this.locationid = locationid;
    }
}
