package com.sriramBase.CrudSpringSQL.model;

import javax.persistence.*;

@Entity
public class employee {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String name;
    private String field;
    private String office;
    protected  employee()
    {

    }
    public employee(int id, String name, String field, String office) {
        this.id = id;
        this.name = name;
        this.field = field;
        this.office = office;
    }
    @Override
    public String toString()
    {
        return id+":"+name+":"+office+":"+field;
    }

}
