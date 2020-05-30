package Boleteria;

/**
 * Boleto
 */
public class Boleto {
    private int sala;
    private Pelicula pelicula;
    private String asiento;

    public Boleto(int sala, Pelicula pelicula, String asiento) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.asiento = asiento;
        System.out.print("s");
    }

    private String generarLinea(String tipo) {
        String str = "";
        if (tipo == "arriba") {
            str = str.concat("â”Œ");
            for (int j = 0; j < 50; j++) {
                str = str.concat("â”€");
            }
            str = str.concat("â”�");
        }
        else if(tipo == "abajo"){
            str = str.concat("â””");
            for (int j = 0; j < 50; j++) {
                str = str.concat("â”€");
            }
            str = str.concat("â”˜"); 
        }
        return str;
    }

    private String generarLinea(String txt, String valor) {
        String str = "";
        int ancho;
        
        str = str.concat("â”‚"+txt+valor);
        ancho=str.length();
        for (int j = 0; j < 51-ancho; j++) {
            str = str.concat(" ");
        }
        str = str.concat("â”‚");
        return str;
    }

    public void factura() {
        System.out.println(generarLinea("arriba"));
        System.out.println(generarLinea("Sala: ",String.valueOf(sala)));
        System.out.println(generarLinea("Hora: ",pelicula.getHora()));
        System.out.println(generarLinea("Asiento: ",asiento.toUpperCase()));
        System.out.println(generarLinea("Pelicula: ",pelicula.getTitulo()));
        System.out.println(generarLinea("abajo"));
    }

    public int getSala() {
        return sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}