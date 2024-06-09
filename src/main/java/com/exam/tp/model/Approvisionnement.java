package com.exam.tp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "approvisionnement")
public class Approvisionnement {
    @Id
    private String id;
    private Boutique boutique;
    private AgentVendeur agentVendeur;
    private Produit produit;
    private int quantite_stock;
    private Date date_stock;
}
