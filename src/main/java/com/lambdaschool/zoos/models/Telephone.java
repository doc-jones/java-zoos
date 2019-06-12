package com.lambdaschool.zoos.models;


import javax.persistence.*;

@Entity
@Table(name = "telephone")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;

    private String telephonetype;


}
