package com.icatec.prueba.service;

import com.icatec.prueba.entity.TipoDocumento;
import com.icatec.prueba.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;


    public List<TipoDocumento> listarTiposDocumentos() {
        return tipoDocumentoRepository.findAll();
    }
}
