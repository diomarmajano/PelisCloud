package pelis.cloud.peliscloud;

public class PelisCloud {
    private int id;
    private int año;
    private String titulo;
    private String director;
    private String genero;
    private String sinopsis;

    public PelisCloud(int id, int año, String titulo, String director, String genero, String sinopsis) {
        this.id = id;
        this.año = año;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }
    public int getAño() {
        return año;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public String getGenero() {
        return genero;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    
}

