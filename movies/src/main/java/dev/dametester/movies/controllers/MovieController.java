package dev.dametester.movies.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dametester.movies.MovieService;
import dev.dametester.movies.models.MovieResponse;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<MovieResponse>> allMovies(){
        return new ResponseEntity<List<MovieResponse>>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MovieResponse>> getMovie(@PathVariable String id){
        return new ResponseEntity<Optional<MovieResponse>>(movieService.getMovie(id), HttpStatus.OK);
    }

    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<MovieResponse>> getMovieByImdb(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<MovieResponse>>(movieService.getMovieByImdbId(imdbId), HttpStatus.OK);
    }
    
}
