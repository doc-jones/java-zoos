package com.lambdaschool.zoos.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    @OneToMany(mappedBy = "zoo")
    private List<Animal> animals = new ArrayList<>();

    @JoinTable(name = "zooanimals",
            joinColumns = {@JoinColumn(name = "zooid")},
            inverseJoinColumns = {@JoinColumn(name = "animalid")})
    private List<Animal> animalss = new ArrayList<>();

    public Zoo() {
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
