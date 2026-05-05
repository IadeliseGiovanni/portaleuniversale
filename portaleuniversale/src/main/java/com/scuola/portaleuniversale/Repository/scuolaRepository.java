package com.scuola.portaleuniversale.Repository;

import com.scuola.portaleuniversale.Model.scuola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface scuolaRepository extends JpaRepository<scuola, Long> {
    // Non scrivere nulla qui dentro per ora, Spring fa tutto da solo!
}