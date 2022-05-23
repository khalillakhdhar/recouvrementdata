package com.demo.controller.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Offre;

public interface OffreInterFaceService {
	public Offre addOneOffre(Offre offre);
	public List<Offre> findOffres();
	public Optional<Offre> findOneOffre(String id);
	public void deleteOffre(String id);

}
