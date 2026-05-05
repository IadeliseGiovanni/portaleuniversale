package com.scuola.portaleuniversale.Controller;

import com.scuola.portaleuniversale.Dto.scuolaDto;
import com.scuola.portaleuniversale.Service.scuolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scuola")
@CrossOrigin(origins = "http://localhost:4200")
public class scuolaController {

    @Autowired
    private scuolaService service;

    // GET: http://localhost:8080/api/scuola/all
    @GetMapping("/all")
    public List<scuolaDto> getAllScuola() {
        return service.findAll();
    }

    // POST: http://localhost:8080/api/scuola/save
    @PostMapping("/save")
    public scuolaDto saveScuola(@RequestBody scuolaDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteScuola(@PathVariable Long id) {
        service.delete(id); // Assicurati che il tuo service Java abbia il metodo delete
    }
}