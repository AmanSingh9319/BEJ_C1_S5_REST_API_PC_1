package com.niit34.BEJ_C1_S5_REST_API_PC_1.repository;

import com.niit34.BEJ_C1_S5_REST_API_PC_1.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {

}
