package CatalogoPeliculasApp.Services;

import CatalogoPeliculasApp.Entity.Movie;

import java.io.*;

public class ArchivoMovieService implements IMoviesService {

    private final String archiveName = "movie.txt";

    public ArchivoMovieService() {
        var archivo = new File(archiveName);
        try {
            //validamos si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("The file already exists!");
            } else {
                // sino creamos el archivo
                var exit = new PrintWriter(new FileWriter(archivo));
                exit.close();
                System.out.println("File has been created");
            }

        } catch (Exception e) {
            System.out.println("An ocurred a error opening the file: " + e.getMessage());
        }
    }


    @Override
    public void listMovie() {
        var archivo = new File(archiveName);
        try {
            System.out.println("Movie List");
            // Abrimos el archivo
            var input = new BufferedReader(new FileReader(archivo));
            //leemos la linea y luego ingresamos al ciclo para la mostrar la pelicula
            String line = input.readLine();
            while (line != null) {
                var movie = new Movie(line);
                System.out.println(movie.toString());
                // repetimos la variable de entrada de linea para asi asginar el nuevo valor a la linea y seguir leyendo
                line = input.readLine();
            }
            input.close();
        } catch (Exception e) {
            System.out.println("An ocurred a error reading the file: " + e.getMessage());
        }
    }

    @Override
    public void addMovie(Movie movie) {
        boolean append = false;
        var archivo = new File(archiveName);
        try {
            if (archivo.exists()) {
                append = true;
                var exit = new PrintWriter(new FileWriter(archivo, append));
                exit.println(movie.toString());
                exit.close();
                System.out.println("the movie was added to the archive");
            }

        } catch (Exception e) {
            System.out.println("An ocurred a error adding the movie: " + e.getMessage());
        }

    }

    @Override
    public void findMovie(Movie movie) {
        var archivo = new File(archiveName);
        try { //Abrimos el archivo en modo lectura
            var input = new BufferedReader(new FileReader(archivo));
            String textLine = input.readLine();
            int index = 1;
            boolean find = false;
            var findMovie = movie.getName();

            // Buscamos la pelicula
            while (textLine != null) {
                if (findMovie != null && findMovie.equalsIgnoreCase(textLine)) {
                    find = true;
                    break;
                }
                textLine = input.readLine();
                index++;
            }// Si se encontro la pelicula imprimimso el resultado de la busqueda
            if (find == true)
                System.out.println("The movie: " + textLine  + " has been found on line: " + index);
            else
                System.out.println(" the movie has not been found: "+ movie.getName());
            input.close();
        } catch (Exception e) {
            System.out.println("An ocurred a error finding the movie: " + e.getMessage());
        }

    }
}

