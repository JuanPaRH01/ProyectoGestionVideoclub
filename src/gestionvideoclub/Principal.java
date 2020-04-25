package gestionvideoclub;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
        peliculas.add(new Pelicula(123, "Pulp Fiction","Quentin Tarantino"));
        peliculas.add(new Pelicula(345, "El padrino","Francis Ford Coppola"));
        peliculas.add(new Pelicula(567, "La vida es bella","Roberto Benigni"));
        peliculas.add(new Pelicula(789, "El club de la lucha","David Fincher"));
        peliculas.add(new Pelicula(321, "Cadena perpetua","Frank Darabont"));
        peliculas.add(new Pelicula(543, "La lista de Schindler","Steven Spielberg") );
        peliculas.add(new Pelicula(765, "La naranja mecánica","Stanley Kubrick"));
        peliculas.add(new Pelicula(987, "El señor de los anillos","Peter Jackson"));
        peliculas.add(new Pelicula(890, "Forrest Gump","Robert Zemeckis"));
        peliculas.add(new Pelicula(98, "Amelie","Jean-Pierre Jeunet"));
        
    }
    
}
