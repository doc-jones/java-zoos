package com.lambdaschool.zoos.controllers;


import com.lambdaschool.zoos.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/animalcount", produces = {"application/json"})
    public ResponseEntity<?> getCountAnimalsInZoos() {
        return new ResponseEntity<>(animalService.getCountAnimalsInZoos(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{animalid}")
    public ResponseEntity<?> deleteAnimalById(@PathVariable long animalid) {

        animalService.delete(animalid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
