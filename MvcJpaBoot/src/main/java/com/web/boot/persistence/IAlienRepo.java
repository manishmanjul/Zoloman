package com.web.boot.persistence;

import org.springframework.data.repository.CrudRepository;

import com.web.boot.model.Alien;

public interface IAlienRepo extends CrudRepository<Alien, Integer>{

}
