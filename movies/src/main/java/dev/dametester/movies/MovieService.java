package dev.dametester.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.lang.NonNull;

import dev.dametester.movies.models.MovieResponse;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public List<MovieResponse> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<MovieResponse> getMovie(@NonNull String id){
        if (id != null) {
            return movieRepository.findById(id);
        } else {
            return Optional.empty();
        }
    }


    public Optional<MovieResponse> getMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }


}
