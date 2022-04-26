package com.demo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Offre;

public interface OffreRepository extends MongoRepository<Offre, String> {

}
