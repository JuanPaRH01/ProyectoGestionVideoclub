package gestionvideoclub;

public class Pelicula {
    
    private String codPelicula;
    private String titulo;
    private String director;

    public Pelicula(String codPelicula, String titulo, String director) {
        this.codPelicula = codPelicula;
        this.titulo = titulo;
        this.director = director;
    }

    public String getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(String codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula [codPelicula=" + codPelicula + ", titulo=" + titulo + ", director=" + director + "]";
    }
        
}
