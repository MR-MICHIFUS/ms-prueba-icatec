package com.icatec.prueba.controller;

import com.icatec.prueba.bean.ResponseBody;
import com.icatec.prueba.service.CatalogoService;
import com.icatec.prueba.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

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

        responseBody.setData(tipoDocumentoService.listarTiposDocumentos());

        return responseBody;
    }

}
