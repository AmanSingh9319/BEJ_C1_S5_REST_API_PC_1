/*
 *Author Name: Aman Singh
 *Date:20-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.BEJ_C1_S5_REST_API_PC_1.controller;

import com.niit34.BEJ_C1_S5_REST_API_PC_1.domain.Movie;
import com.niit34.BEJ_C1_S5_REST_API_PC_1.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



    @CrossOrigin
    @RestController
    @RequestMapping("/api/v1")
    public class MovieController {
        private MovieServiceImpl movieServiceImpl;

        @Autowired
        public MovieController(MovieServiceImpl movieServiceImpl) {
            this.movieServiceImpl = movieServiceImpl;
        }

        @PostMapping("/insertmovie")
        public ResponseEntity<?> saveFunction(@RequestBody Movie movie) {
            return new ResponseEntity<>(movieServiceImpl.saveMovie(movie), HttpStatus.CREATED);
        }
    }
