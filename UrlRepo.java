package com.info.urlshortner.repository;

import com.info.urlshortner.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UrlRepo extends JpaRepository<Url,Long> {
   Optional<Url> findByShorturl(String shorturl);

}
