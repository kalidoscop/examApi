package com.exam.tp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.tp.model.Vente;
import com.exam.tp.services.VenteService;


@RestController
@RequestMapping("/vente")
public class VenteController {
     @Autowired
    private VenteService  VenteService;

    @PostMapping("/new")
    public Vente createVente(@RequestBody Vente vente){
        return VenteService.create(vente);
    }

    @GetMapping("/list")
    public List<Vente> findAllVente(){
        return VenteService.findAll();
    }
    @GetMapping("/produit/{id}")
    public List<Vente> findByProduit(@PathVariable String id){
        return VenteService.findByProduit(id);
    }
    @GetMapping("/boutique/{id}")
    public List<Vente> findByBoutique(@PathVariable String id){
        return VenteService.findByBoutique(id);
    }
}
