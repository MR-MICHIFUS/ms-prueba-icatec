package com.icatec.prueba.controller;

import com.icatec.prueba.bean.ResponseBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/key")
public class AdminKeyController {

    @GetMapping()
    public ResponseBody validateKey(@RequestHeader("access-key") String accessKey) throws InterruptedException {
        Thread.sleep(3000);//TODO: Para la prueba

        ResponseBody body = new ResponseBody();
        if(accessKey == null || !accessKey.equals("f94u7hf94funo8f49fuhbn429f832d983hjnd9283d")) {
            body.setMessage("Invocación incorrecta");
            body.setStatus("400");
        } else {
            body.setMessage("Invocación correcta");
            body.setStatus("200");
        }
        return body;
    }

}
