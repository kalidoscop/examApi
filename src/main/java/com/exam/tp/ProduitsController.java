package com.exam.tp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.tp.model.Produit;
import com.exam.tp.services.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitsController {
    @Autowired
    private ProduitService  produitService;

    @PostMapping("/new")
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.create(produit);
    }

    @GetMapping("/list")
    public List<Produit> findAllProduit(){
        System.err.println("coucou");
        return produitService.findAll();
    }

    @GetMapping("/{id}")
    public Produit findOneProduit(@PathVariable String id){
        Optional<Produit> produit = produitService.findById(id);
        
        if(produit.isPresent()){
            return produit.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Produit updateProduit(@PathVariable String id ,@RequestBody Produit produit){
        produit.setId(id);
        return produitService.update(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable String id){
        produitService.delete(id);
    }
}
