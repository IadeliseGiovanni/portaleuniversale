package com.scuola.portaleuniversale.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "scuola")
public class scuola {
    @Id
    @GeneratedValue
    private Long id ;
    private String nome ;
    private String cognome ;
    private String email;
    private int age;
}
