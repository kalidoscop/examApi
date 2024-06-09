package com.exam.tp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {

    
}
