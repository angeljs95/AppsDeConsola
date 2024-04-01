package CatalogoPeliculasApp.view;

import CatalogoPeliculasApp.Entity.Movie;
import CatalogoPeliculasApp.Services.ArchivoMovieService;
import CatalogoPeliculasApp.Services.IMoviesService;

import java.util.Scanner;

public class MovieCatalogApp {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var exit = false;

        //IMoviesService serviceMovie = new ListMovieService();
        IMoviesService serviceMovie= new ArchivoMovieService();
        while (!exit) {
            try {
                showMenu();
                exit = executeOption(sc, serviceMovie);
            } catch (Exception e) {
                System.out.println("An ocurred a error: " + e.getMessage());
            }
            System.out.println();
        }
}

// Mostrar el menu
    public static void showMenu() {
        System.out.println("""
                 ********************* Movie Catalog App**********************
                 1. Add Movie
                 2. List Movies
                 3. Find Movie
                 4. Exit
                 Select a Option to continue
                """);
    }

    // Operar el menu a traves de la entrada
    public static boolean executeOption(Scanner sc, IMoviesService service) {

        var exit = false;
        var option = Integer.parseInt(sc.nextLine());

        switch (option) {
            case 1 -> {
                System.out.print(" Enter the name of the Movie: ");
                String name = sc.nextLine();
                service.addMovie(new Movie(name));
            }
            case 2 -> {
                service.listMovie();
            }
            case 3 -> {
                System.out.print(" Enter the name of the movie search: ");
                String find = sc.nextLine();
                service.findMovie(new Movie(find));
            }
            case 4 -> {
                System.out.println("See you later Sr...");
                exit = true;
            }
            default -> System.out.println(" Unknow Option: " + option);
        }

        return exit;
    }

}
