package br.com.alura.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSerie(@JsonAlias("Title") String title,
                        @JsonAlias("totalSeasons") Integer TotalTemporadas,
                        @JsonAlias("imdbRating") String avaliacao){

}
