package com.exam.tp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.tp.model.Superviser;
import com.exam.tp.services.SuperviserService;

@RestController
@RequestMapping("/superviser")
public class SuperviserController {
     @Autowired
    private SuperviserService  SuperviserService;

    @PostMapping("/new")
    public Superviser createSuperviser(@RequestBody Superviser superviser){
        return SuperviserService.create(superviser);
    }

    @GetMapping("/list")
    public List<Superviser> findAllSuperviser(){
        return SuperviserService.findAll();
    }
    @GetMapping("/agent/{id}")
    public List<Superviser> findByAgent(@PathVariable String id){
        return SuperviserService.findByAgent(id);
    }
    @GetMapping("/superviseur/{id}")
    public List<Superviser> findByBoutique(@PathVariable String id){
        return SuperviserService.findBySuperviseur(id);
    }
}
