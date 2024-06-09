package com.exam.tp.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Boutique;

public interface BoutiqueRepository extends MongoRepository<Boutique, String>{
    
}
