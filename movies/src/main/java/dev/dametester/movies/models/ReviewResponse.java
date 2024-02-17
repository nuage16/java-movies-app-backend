package dev.dametester.movies.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponse {

    public ReviewResponse(String body){
        this.body = body;
    }


    @Id
    private String id;
    private String body;
}
