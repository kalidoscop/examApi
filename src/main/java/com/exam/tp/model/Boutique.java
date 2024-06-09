package com.exam.tp.model;


// import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "utilisateur")
public class Boutique extends Utilisateur {

    private int boutique_id;
    private String nom_boutique;
    private String tel_boutique;
    private String adresse_boutique;
}
