package com.exam.tp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Produit;

public interface ProduitRepository extends MongoRepository<Produit, String>{
    
    
}
