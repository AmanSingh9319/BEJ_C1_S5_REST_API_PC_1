/*
 *Author Name: Aman Singh
 *Date:20-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.BEJ_C1_S5_REST_API_PC_1.service;

import com.niit34.BEJ_C1_S5_REST_API_PC_1.domain.Movie;
import com.niit34.BEJ_C1_S5_REST_API_PC_1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements IMovieservice{
    private MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl (MovieRepository movieRepository){
        this.movieRepository=movieRepository;
    }


    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}
