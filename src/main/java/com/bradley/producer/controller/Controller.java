package com.bradley.producer.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")//todo inject from properties
public class Controller {//todo create open api spec
    @PostMapping("/{request-body-name}")
    public ResponseEntity<String> consumeRequest(@PathVariable String pathVar, @RequestBody String body) {
        //todo service write to topic
            //todo extract headers - capture calling url for call back - or have as a header
            //todo wrap body in pojo with PathVar {request-body-name: "", body:""}
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }

}
