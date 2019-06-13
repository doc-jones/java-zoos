package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.views.CountAnimalsinZoos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRespository extends CrudRepository<Animal, Long > {

//    SELECT z.animalid, animaltype, count(z.zooid) as countanimals
//    FROM zooanimals z
//    INNER JOIN a.animalid
//    ON z.animalid = a.animalid
//    GROUP BY z.animalid, a.animaltype

    @Query(value = "SELECT z.animalid, a.animaltype, count(a.animalid) as countanimals FROM zooanimals z INNER JOIN animal a ON z.animalid = a animalid GROUP BY z.animalid, a.animaltype", nativeQuery = true)
    ArrayList<CountAnimalsinZoos> getCountAnimalsInZoos();

    //    "DELETE
//    FROM zooanimals
//    WHERE animals = :animalid", nativeQuery = true)

    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE animals = :animalid", nativeQuery = true)
    void  deleteCountAnimalsInZoos();

}
