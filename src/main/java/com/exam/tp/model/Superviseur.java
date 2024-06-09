package com.exam.tp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "utilisateur")
public class Superviseur extends Utilisateur{
    private int supervis_id;
    private String nom_supervis;
    private String prenom_supervis;
}
