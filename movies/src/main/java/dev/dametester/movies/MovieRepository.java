package dev.dametester.movies;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.dametester.movies.models.MovieResponse;

@Repository
public interface MovieRepository extends MongoRepository<MovieResponse, String>{
    Optional<MovieResponse> findMovieByImdbId(String imdbId);
}
