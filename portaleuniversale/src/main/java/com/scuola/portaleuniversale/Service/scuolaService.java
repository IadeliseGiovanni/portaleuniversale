package com.scuola.portaleuniversale.Service;

import com.scuola.portaleuniversale.Dto.scuolaDto;
import com.scuola.portaleuniversale.Mapper.scuolaMapper;
import com.scuola.portaleuniversale.Model.scuola;
import com.scuola.portaleuniversale.Repository.scuolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class scuolaService {

    @Autowired
    private scuolaRepository repository; // Per parlare con pgAdmin

    @Autowired
    private scuolaMapper mapper; // Il "traduttore" ModelMapper che abbiamo visto prima

    // Metodo per ottenere tutti gli studenti (da Entity a DTO)
    public List<scuolaDto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    // Metodo per salvare un nuovo studente
    public scuolaDto save(scuolaDto dto) {
        scuola entity = mapper.toEntity(dto);
        scuola savedEntity = repository.save(entity);
        return mapper.toDto(savedEntity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}