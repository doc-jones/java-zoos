package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repos.AnimalRepository;
import com.lambdaschool.zoos.views.CountAnimalsInZoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "AnimalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public ArrayList<Animal> findAll()
    {
        ArrayList<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Animal findAnimalByType(String type) throws EntityNotFoundException
    {
        Animal animal = animalrepos.findByAnimaltype(type);

        if (animal == null)
        {
            throw new EntityNotFoundException("Animal " + type + " not found!");
        }
        return animal;
    }


    @Override
    public ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos()
    {
        return animalrepos.getCountAnimalsinZoos();
    }
}

