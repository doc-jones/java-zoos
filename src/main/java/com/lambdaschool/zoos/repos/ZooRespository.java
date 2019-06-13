package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.views.CountAnimalsinZoos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.ArrayList;

import static org.hibernate.FetchMode.JOIN;

public interface ZooRespository extends CrudRepository<Zoo, Long> {




//    Put and post zoo and animal combination don't get executed in normal way - connect a zoo and an animal

//     localhost:2019/h2-console
}
