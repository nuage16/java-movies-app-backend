package dev.dametester.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.lang.NonNull;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(@NonNull ObjectId id){
        if (id != null) {
            return movieRepository.findById(id);
        } else {
            return Optional.empty();
        }
    }


    public Optional<Movie> getMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }


}
