package com.lambdaschool.zoos.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "telephone")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;

    private String telephonetype;
    private String telephonenumber;


    @ManyToOne
    @JoinColumn
    private Zoo zoo;

    public Telephone() {
    }

    public Telephone(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public long getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(long telephoneid) {
        this.telephoneid = telephoneid;
    }

    public String getTelephonetype() {
        return telephonetype;
    }

    public void setTelephonetype(String telephonetype) {
        this.telephonetype = telephonetype;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
