package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repos.AnimalRespository;
import com.lambdaschool.zoos.views.CountAnimalsinZoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRespository animalrepos;

    @Override
    public ArrayList<Animal> findAll() {
        ArrayList<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public void delete(long id) {

        if (animalrepos.findById(id).isPresent()) {
            animalrepos.deleteCountAnimalsFromZooanimals(id);
            animalrepos.deleteById(id);
        }
        else {
            throw new EntityNotFoundException(Long.toString(id));
        }
    }

    @Override
    public ArrayList<CountAnimalsinZoos> getCountAnimalsInZoos() {
        
        return animalrepos.getCountAnimalsInZoos();
    }
}
