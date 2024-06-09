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

import com.exam.tp.model.Superviseur;
import com.exam.tp.services.SuperviseurService;

@RestController
@RequestMapping("/superviseur")
public class SuperviseurController {
    @Autowired
    private SuperviseurService  superviseurService;

    @PostMapping("/new")
    public Superviseur createSuperviseur(@RequestBody Superviseur superviseur){
        return superviseurService.create(superviseur);
    }

    @GetMapping("/list")
    public List<Superviseur> findAllSuperviseur(){
        System.err.println("coucou");
        return superviseurService.findAll();
    }

    @GetMapping("/{id}")
    public Superviseur findOneSuperviseur(@PathVariable String id){
        Optional<Superviseur> superviseur = superviseurService.findById(id);
        
        if(superviseur.isPresent()){
            return superviseur.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Superviseur updateSuperviseur(@PathVariable String id ,@RequestBody Superviseur superviseur){
        superviseur.setId(id);
        return superviseurService.update(superviseur);
    }

    @DeleteMapping("/{id}")
    public void deleteSuperviseur(@PathVariable String id){
        superviseurService.delete(id);
    }
}
