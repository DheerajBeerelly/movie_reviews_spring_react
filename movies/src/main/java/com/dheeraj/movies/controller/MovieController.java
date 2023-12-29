package com.dheeraj.movies.controller;

import com.dheeraj.movies.model.Movies;
import com.dheeraj.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movies>> allMovies(){
        return new ResponseEntity<List<Movies>> (movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> movieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movies>>(movieService.getMovieByImdbId(imdbId),HttpStatus.OK);

    }


}
