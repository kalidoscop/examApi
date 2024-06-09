package com.exam.tp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Superviseur;

public interface  SuperviseurRepository extends MongoRepository<Superviseur, String>{
    
}
