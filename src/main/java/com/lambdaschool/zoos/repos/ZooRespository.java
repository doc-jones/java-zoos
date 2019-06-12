package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.ArrayList;

public interface ZooRespository extends CrudRepository<Zoo, Long> {

//    SELECT z.animalid, animaltype, count(z.zooid) as countanimals
//    FROM zooanimals z
//    INNER JOIN a.animalid
//    ON z.animalid = a.animalid
//    GROUP BY z.animalid, a.animaltype

    @Query(value = "SELECT z.animalid, animaltype, count(z.zooid) as countanimals" FROM zooanimals z INNER JOIN a.animalid ON z.animalid = a.animalid GROUP BY z.animalid, a.animaltype, nativeQuery = true)
    ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos();


//    "DELETE
//    FROM zooanimals
//    WHERE animals = :animalid", nativeQuery = true)

    @Query(value = "DELETE FROM zooanimals WHERE animals = :animalid, nativeQuery = true")
    void  

}
