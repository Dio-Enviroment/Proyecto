package Boleteria;

/**
 * Pelicula
 */
public class Pelicula {
    private int id;
    private String titulo;
    private int duracion;
    private boolean estreno;
    private String hora;

    public Pelicula(int id, String titulo, int duracion, boolean estreno, String hora) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.estreno = estreno;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return  id +" - ["+hora+"] "+titulo+" ("+duracion+") "+((estreno) ? "* Estreno *" : "");
    }  
}