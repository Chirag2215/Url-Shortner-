package com.info.urlshortner.controller;

import ch.qos.logback.core.model.Model;
import com.info.urlshortner.Dto.Urldto;
import com.info.urlshortner.service.UrlService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;

@RestController
public class UrlController {
    @Autowired
    private UrlService urlservice;

    @PostMapping("/url")
    public ResponseEntity<?> CreatUrl(@RequestBody Urldto url){
        ResponseEntity<?> createurl = urlservice.createurl(url);
return createurl;
    }

    @GetMapping("/url/{shorturl}")
    public ResponseEntity<?> redirect(@PathVariable String shorturl, Model model) {
        String sendpage = urlservice.sendpage(shorturl);

        if ("error".equals(sendpage)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Short URL not found");
        }

        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(sendpage))
                .build();
    }
    //testing porpose
    @GetMapping("/swegger")
    public String getSegger(){
        return "Ok";
    }
}
