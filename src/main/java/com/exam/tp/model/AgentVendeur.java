package com.exam.tp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "utilisateur")
public class AgentVendeur extends Utilisateur{
    private int agent_id;
    private String nom_agent;
    private String prenom_agent;
}
