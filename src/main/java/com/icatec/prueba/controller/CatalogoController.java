package com.icatec.prueba.controller;

import com.icatec.prueba.bean.ResponseBody;
import com.icatec.prueba.bean.TipoDocumento;
import com.icatec.prueba.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping()
    public ResponseBody listarCatalogo() {
        ResponseBody responseBody = new ResponseBody();
        responseBody.setStatus("200");
        responseBody.setMessage("OK");

        responseBody.setData(catalogoService.listarCatalogo());

        return responseBody;
    }

    @GetMapping("/tipo-documento")
    public ResponseBody listarTiposDocumentos() {
        ResponseBody responseBody = new ResponseBody();
        responseBody.setStatus("200");
        responseBody.setMessage("OK");

        List<TipoDocumento> listaTiposDocumentos = new ArrayList<>();

        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setCodigo("CEX");
        tipoDocumento1.setDescripcion("Carnet de extranjeria");
        tipoDocumento1.setMaximoCaracteres(9);
        tipoDocumento1.setExpresionRegular("^(E|P)?\\d{7,9}$");
        listaTiposDocumentos.add(tipoDocumento1);

        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setCodigo("DNI");
        tipoDocumento2.setDescripcion("Documento nacional de identidad");
        tipoDocumento2.setMaximoCaracteres(8);
        tipoDocumento2.setExpresionRegular("^\\d{8}$");
        listaTiposDocumentos.add(tipoDocumento2);

        TipoDocumento tipoDocumento3 = new TipoDocumento();
        tipoDocumento3.setCodigo("PAS");
        tipoDocumento3.setDescripcion("Pasaporte");
        tipoDocumento3.setMaximoCaracteres(8);
        tipoDocumento3.setExpresionRegular("^[A-Z]{2}\\d{6}$");
        listaTiposDocumentos.add(tipoDocumento3);

        TipoDocumento tipoDocumento4 = new TipoDocumento();
        tipoDocumento4.setCodigo("PTP");
        tipoDocumento4.setDescripcion("Permiso Temporal de Permanencia");
        tipoDocumento4.setMaximoCaracteres(11);
        tipoDocumento4.setExpresionRegular("");
        listaTiposDocumentos.add(tipoDocumento4);

        responseBody.setData(listaTiposDocumentos);
        return responseBody;
    }

}
