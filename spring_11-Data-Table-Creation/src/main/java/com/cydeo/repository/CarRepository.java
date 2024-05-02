package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository // we dont have to put this here . Spring do it automatically
public interface CarRepository extends JpaRepository<Car,Long> {

// we will ue jparepository methods in data generator in boostrap package.








}
