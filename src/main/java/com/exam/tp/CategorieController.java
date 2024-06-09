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

import com.exam.tp.model.Categorie;
import com.exam.tp.services.CategorieService;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
    @Autowired
    private CategorieService  categorieService;

    @PostMapping("/new")
    public Categorie createCategorie(@RequestBody Categorie categorie){
        return categorieService.create(categorie);
    }

    @GetMapping("/list")
    public List<Categorie> findAllCategorie(){
        System.err.println("coucou");
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public Categorie findOneCategorie(@PathVariable String id){
        Optional<Categorie> categorie = categorieService.findById(id);
        
        if(categorie.isPresent()){
            return categorie.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Categorie updateCategorie(@PathVariable String id ,@RequestBody Categorie categorie){
        categorie.setId(id);
        return categorieService.update(categorie);
    }

    @DeleteMapping("/{id}")
    public void deleteCategorie(@PathVariable String id){
        categorieService.delete(id);
    }
}
