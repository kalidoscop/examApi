package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Produit;
import com.exam.tp.model.Boutique;
import com.exam.tp.model.Vente;
import com.exam.tp.repositories.ProduitRepository;
import com.exam.tp.repositories.BoutiqueRepository;
import com.exam.tp.repositories.VenteRepository;

@Service
public class VenteServiceImpl implements VenteService{
    @Autowired
    private VenteRepository VenteRepository;
    @Autowired
    private ProduitRepository ProduitRepository;
    @Autowired
    private BoutiqueRepository boutiqueRepository;

    public Vente create(Vente data) {
        return VenteRepository.save(data);
    }

    public List<Vente> findAll() {
        return VenteRepository.findAll();
    }

    public List<Vente> findByProduit(String id) {
        Optional<Produit> Produit = ProduitRepository.findById(id);
        if (Produit.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("produit").is(Produit));
            return VenteRepository.findByProduit(Produit);
        } else {
            return null;
        }
    }

    public List<Vente> findByBoutique(String id) {
        Optional<Boutique> boutique = boutiqueRepository.findById(id);
        if (boutique.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("boutique").is(boutique));
            return VenteRepository.findByBoutique(boutique);
        } else {
            return null;
        }
    }
}
