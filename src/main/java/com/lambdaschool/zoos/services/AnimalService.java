package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.views.CountAnimalsinZoos;

import java.util.ArrayList;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    ArrayList<CountAnimalsinZoos> getCountAnimalsInZoos();
}