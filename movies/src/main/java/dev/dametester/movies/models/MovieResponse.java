package dev.dametester.movies.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse{
    @Id
    private String id;
    private String imdbId;
    private String title;
    private String  releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backDrop;
    // Manual reference relationship
    @DocumentReference
    private List<ReviewResponse> reviewIds;
}