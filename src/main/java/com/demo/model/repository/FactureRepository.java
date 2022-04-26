package com.demo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Facture;

public interface FactureRepository extends MongoRepository<Facture, String> {

}
