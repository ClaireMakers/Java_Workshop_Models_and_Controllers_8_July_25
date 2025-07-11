package com.makers.makersbnb_coach_support_code.repository;

import com.makers.makersbnb_coach_support_code.model.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
    public Planet findByName(String name);

}
