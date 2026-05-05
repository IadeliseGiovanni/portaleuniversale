package com.scuola.portaleuniversale.Mapper;

import com.scuola.portaleuniversale.Dto.scuolaDto;
import com.scuola.portaleuniversale.Model.scuola;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class scuolaMapper {

    @Autowired
    private ModelMapper mapper;

    public scuolaDto toDto(scuola entity) {
        if (entity == null) return null;
        return mapper.map(entity, scuolaDto.class);
    }

    public scuola toEntity(scuolaDto dto) {
        if (dto == null) return null;
        return mapper.map(dto, scuola.class);
    }
}