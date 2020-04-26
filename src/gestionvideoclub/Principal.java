package gestionvideoclub;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        boolean iniciado = true;
        Scanner sc = new Scanner(System.in);
        int op;
        
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
        
        while (iniciado == true) {  
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Consultar datos cliente");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion del menú: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    String codCli, nombre, apellidos;
                    
                    System.out.print("Introduce un codigo para el cliente: ");
                    codCli = sc.nextLine();
                    System.out.print("Introduce el nombre del cliente: ");
                    nombre = sc.nextLine();
                    System.out.print("Introduce los apellidos del cliente: ");
                    apellidos = sc.nextLine();
                    
                    clientes.add(new Cliente(codCli, nombre, apellidos));
                    break;
                    
                case 2:
                    String codCliDatos;
                    System.out.print("Introduce el codigo del cliente: ");
                    codCliDatos = sc.nextLine();
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cli = clientes.get(i);
                        if (cli.getCodCliente().equalsIgnoreCase(codCliDatos)) {
                            System.out.println(cli);
                        }
                    }
                    break;
                    
                case 3:
                    String codCliAlquilar, nomPeliAlquilar;
                    Cliente cliAlquilar = null;
                    Pelicula peliAlquilar = null;
                    System.out.print("Introduce el nombre del cliente: ");
                    codCliAlquilar = sc.nextLine();
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cli = clientes.get(i);
                        if (cli.getCodCliente().equalsIgnoreCase(codCliAlquilar)) {
                            cliAlquilar = cli;
                        }
                    }
                    
                    System.out.print("Introduce el nombre de la pelicula que va a alquilar el cliente");
                    nomPeliAlquilar = sc.nextLine();
                    for (int i = 0; i < peliculas.size(); i++) {
                        Pelicula peli = peliculas.get(i);
                        if (peli.getTitulo().equalsIgnoreCase(nomPeliAlquilar)) {
                            peliAlquilar = peli;
                        }
                    }
                    
                    if (cliAlquilar.alquilar(peliAlquilar)) {
                        System.out.println("Pelicula alquilada correctamente");
                    } else {
                        System.out.println("Esta pelicula ya ha sido alquilada solo se puede alquilar una vez la pelicula");
                    }
                    
                    
                    break;
                
                case 4:
                    iniciado = false;
                    System.out.println("Adios!");
                    break;
                    
                default:
            }
        }
        
    }
    
}
