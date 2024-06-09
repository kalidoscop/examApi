package com.exam.tp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Boutique;
import com.exam.tp.model.Produit;
import com.exam.tp.model.Vente;

public interface VenteRepository extends MongoRepository<Vente, String> {
    List<Vente> findByBoutique(Optional<Boutique> boutique);
    List<Vente> findByProduit(Optional<Produit> produit);

}
