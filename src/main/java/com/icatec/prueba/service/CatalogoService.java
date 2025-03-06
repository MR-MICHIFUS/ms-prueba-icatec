package com.icatec.prueba.service;

import com.icatec.prueba.entity.Catalogo;
import com.icatec.prueba.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoService {
    @Autowired
    private CatalogoRepository catalogoRepository;

    public List<Catalogo> listarCatalogo() {
        return catalogoRepository.findAll();
    }
}
