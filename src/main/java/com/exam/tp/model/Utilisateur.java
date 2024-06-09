package com.exam.tp.model;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "utilisateur")
public class Utilisateur {
    @Id
    private String id;
    private String user_name;
    private String user_password;
    private String user_email;
    @CreatedDate
    private LocalDate createdDate;
    
}
