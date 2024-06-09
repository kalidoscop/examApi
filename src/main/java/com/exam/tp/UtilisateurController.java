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

import com.exam.tp.model.Utilisateur;
import com.exam.tp.services.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")

public class UtilisateurController {
    @Autowired
    private UtilisateurService  utilisateurService;

    @PostMapping("/new")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.create(utilisateur);
    }

    @GetMapping("/list")
    public List<Utilisateur> findAllUtilisateur(){
        System.err.println("coucou");
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    public Utilisateur findOneUtilisateur(@PathVariable String id){
        Optional<Utilisateur> utilisateur = utilisateurService.findById(id);
        
        if(utilisateur.isPresent()){
            return utilisateur.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable String id ,@RequestBody Utilisateur utilisateur){
        utilisateur.setId(id);
        return utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable String id){
        utilisateurService.delete(id);
    }
}
