package com.demo.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Offre;
import com.demo.model.repository.OffreRepository;

@Service
public class OffreService implements OffreInterFaceService {
@Autowired
OffreRepository offreRepository;
	@Override
	public Offre addOneOffre(Offre offre) {
		// TODO Auto-generated method stub
		return offreRepository.save(offre);
	}

	@Override
	public List<Offre> findOffres() {
		// TODO Auto-generated method stub
		return offreRepository.findAll();
	}

	@Override
	public Optional<Offre> findOneOffre(String id) {
		// TODO Auto-generated method stub
		return offreRepository.findById(id);
	}

	@Override
	public void deleteOffre(String id) {
		// TODO Auto-generated method stub
		offreRepository.deleteById(id);
	}

}
