package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


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

    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE animals = :animalid, nativeQuery = true")
    void  deleteCountAnimalsInZoos();



//    ManyToMany between zoos and animals

//    OneToMany between zoos and telephone

//    Put and post zoo and animal combination don't get executed in normal way - connect a zoo and an animal

//     localhost:2019/h2-console
}
