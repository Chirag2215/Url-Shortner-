package com.info.urlshortner.service;

import com.info.urlshortner.Dto.Urldto;
import org.springframework.http.ResponseEntity;

public interface UrlService {
    public ResponseEntity<?> createurl(Urldto urldto);
//    public ResponseEntity<?> shorturl();
    public String sendpage(String shorturl);
}
