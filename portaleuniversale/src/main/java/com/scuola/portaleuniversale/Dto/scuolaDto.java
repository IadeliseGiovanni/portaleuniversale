package com.scuola.portaleuniversale.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class scuolaDto {
    private Long id ;
    private String nome ;
    private String cognome ;
    private String email;
    private int age; ;
}
