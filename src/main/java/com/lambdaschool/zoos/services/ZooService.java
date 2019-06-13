package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.views.CountAnimalsinZoos;

import java.util.ArrayList;

public interface ZooService {

    ArrayList<Zoo> findAll();

    void delete(long id);

    ArrayList<CountAnimalsinZoos> getCountAnimalsInZoos();
}
