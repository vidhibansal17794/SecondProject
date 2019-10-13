package com.example.SpringWebJPA.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface AlienRepo<Alien, aid> extends  JpaRepository<Alien, Integer> {
	
}
