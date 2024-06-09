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

import com.exam.tp.model.Boutique;
import com.exam.tp.services.BoutiqueService;
@RestController
@RequestMapping("/boutique")

public class BoutiqueController {
    @Autowired
    private BoutiqueService  boutiqueService;

    @PostMapping("/new")
    public Boutique createBoutique(@RequestBody Boutique boutique){
        return boutiqueService.create(boutique);
    }

    @GetMapping("/list")
    public List<Boutique> findAllBoutique(){
        System.err.println("coucou");
        return boutiqueService.findAll();
    }

    @GetMapping("/{id}")
    public Boutique findOneBoutique(@PathVariable String id){
        Optional<Boutique> boutique = boutiqueService.findById(id);
        
        if(boutique.isPresent()){
            return boutique.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Boutique updateBoutique(@PathVariable String id ,@RequestBody Boutique boutique){
        boutique.setId(id);
        return boutiqueService.update(boutique);
    }

    @DeleteMapping("/{id}")
    public void deleteBoutique(@PathVariable String id){
        boutiqueService.delete(id);
    }
}
