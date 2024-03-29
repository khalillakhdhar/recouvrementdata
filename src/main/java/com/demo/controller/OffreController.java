package com.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.controller.service.OffreService;
import com.demo.model.Offre;

@RestController
@RequestMapping("Offre")
public class OffreController {
@Autowired
OffreService offreServiceImplement;
@PostMapping
public Offre AjoutOffre(@RequestBody @Valid Offre offre)
{
return offreServiceImplement.addOneOffre(offre);	
}
@GetMapping
public List<Offre> getAllOffre()
{
return offreServiceImplement.findOffres();	
}
@GetMapping("/{id}")
public Optional<Offre> getMyOffre(@PathVariable String id)
{
return offreServiceImplement.findOneOffre(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable String id)
{
offreServiceImplement.deleteOffre(id);	
}

}
