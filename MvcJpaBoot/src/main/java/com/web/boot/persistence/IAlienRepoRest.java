package com.web.boot.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.boot.model.Alien;

public interface IAlienRepoRest extends JpaRepository<Alien, Integer>{

	List<Alien> findByaTech(String tech);
	
	
	@Query("from Alien where aName like %?1%")
	List<Alien> findByNameLike(String nameLike);
	
}