package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;

import java.util.ArrayList;

public interface AnimalService {

    ArrayList<Zoo> findAll();

    void delete(long id);
}
