/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.entities;

/**
 *
 * @author MimiKuchiki
 */
public class BelongsTo {
    private String id;
    private String name;
    private String firstname;
    private String middlename;
    private String lastname;
    private String type;
    private String industry;
    
    public BelongsTo(){
    
    }

    
    public BelongsTo(String id, String name, String firstname, String middlename, String lastname, String type, String industry) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.type = type;
        this.industry = industry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "BelongsTo{" + "id=" + id + ", name=" + name + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", type=" + type + ", industry=" + industry + '}';
    }
    
    
    
    
}
