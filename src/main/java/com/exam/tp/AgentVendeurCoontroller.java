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

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.services.AgentVendeurService;

@RestController
@RequestMapping("/agent-vendeur")

public class AgentVendeurCoontroller {
    @Autowired
    private AgentVendeurService  AgentVendeurService;

    @PostMapping("/new")
    public AgentVendeur createAgentVendeur(@RequestBody AgentVendeur agentVendeur){
        return AgentVendeurService.create(agentVendeur);
    }

    @GetMapping("/list")
    public List<AgentVendeur> findAllAgentVendeur(){
        System.err.println("coucou");
        return AgentVendeurService.findAll();
    }

    @GetMapping("/{id}")
    public AgentVendeur findOneAgentVendeur(@PathVariable String id){
        Optional<AgentVendeur> agentVendeur = AgentVendeurService.findById(id);
        
        if(agentVendeur.isPresent()){
            return agentVendeur.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public AgentVendeur updateAgentVendeur(@PathVariable String id ,@RequestBody AgentVendeur agentVendeur){
        agentVendeur.setId(id);
        return AgentVendeurService.update(agentVendeur);
    }

    @DeleteMapping("/{id}")
    public void deleteAgentVendeur(@PathVariable String id){
        AgentVendeurService.delete(id);
    }
}
