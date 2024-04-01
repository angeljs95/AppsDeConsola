package CatalogoPeliculasApp.Services;

import CatalogoPeliculasApp.Entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class ListMovieService implements IMoviesService {

    private final List<Movie> movies;

    public ListMovieService (){
        this.movies= new ArrayList<>();
    }

    @Override
    public void listMovie() {
        System.out.println(" Movies List: ");
        movies.forEach(System.out::println);
 }

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(" The movie was added: "+ movie);
}
// Metodo para encontrar pelicula,
    @Override
    public void findMovie(Movie movie) {
        var index= movies.indexOf(movie);
        if( index== -1){
            System.out.println("The movie has not been found: "+ movie.getName());
        }else {
            System.out.println(" Movie found in the index: " + index);
        }
 }
}
