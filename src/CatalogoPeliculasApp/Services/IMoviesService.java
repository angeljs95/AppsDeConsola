package CatalogoPeliculasApp.Services;

import CatalogoPeliculasApp.Entity.Movie;

import java.util.List;

public interface IMoviesService {


    public void listMovie();

    public void addMovie(Movie movie);

    public void findMovie(Movie movie);



}
