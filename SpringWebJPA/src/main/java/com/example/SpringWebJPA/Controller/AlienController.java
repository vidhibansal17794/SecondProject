package com.example.SpringWebJPA.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWebJPA.DAO.AlienRepo;
import com.example.SpringWebJPA.model.Alien;

@RestController
public class AlienController {
@Autowired
	AlienRepo repo;
	@RequestMapping("/add")
	public Alien display( @Valid @RequestBody Alien a)
	{
	return (Alien) repo.save(a);
	}
}
