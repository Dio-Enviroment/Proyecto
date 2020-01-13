package Boleteria;

import java.util.Scanner;

/**
 * Cine
 */
public class Cine {
    private Sala sala1;
    private Pelicula[] cartelera;
    private double PRECIO_BOLETO;
    private Boleto[] boletos;

    public Cine() {
        inicializarCartelera();
        sala1=new Sala(1,5,5);
    }

    private void inicializarCartelera() {
        cartelera=new Pelicula[5];
        cartelera[0]=new Pelicula(1,"El Rey León",117,true,"14:30");
        cartelera[1]=new Pelicula(2,"Spiderman: Lejos de Casa",130,true,"16:00");
        cartelera[2]=new Pelicula(3,"Annabelle 3: Vuelve a Casa",106,false,"18:20");
        cartelera[3]=new Pelicula(4,"Avengers: End Game",188,false,"16:15");
        cartelera[4]=new Pelicula(5,"Toy Story 4",104,false,"11:30");
    }
    
    public void mostrarCartelera() {
        System.out.println("- - C A R T E L E R A - -");
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarSala() {
        System.out.println("- - A S I E N T O S - -");
        sala1.mostrarAsientos();
    }

    private int obtenerIdPelicula() {
        return 0;
    }

    private int obtenerNumeroBoletos() {
        return boletos.length;
    }

    public void comprarBoletos() {
        Scanner t=new Scanner(System.in);
        int numBoletos,idPelicula;
        boolean exit=true;
        String asiento;
        System.out.println("- - B O L E T O S - -");
        
        do{
            System.out.println("Ingrese el ID de la película:");
            idPelicula=Integer.parseInt(t.nextLine());
            for (Pelicula pelicula : cartelera) {
                int auxID=Integer.parseInt(pelicula.toString().substring(0, 1));
                if(auxID==idPelicula){
                    exit=false;
                    break;
                }
            }
            if(exit==true){
                System.out.println("No exite el ID de esa película:"); 
            }
        }while(exit);
        System.out.println("Ingrese el número de boletos:");
        numBoletos=Integer.parseInt(t.nextLine());
        boletos=new Boleto[numBoletos];
        System.out.println("Seleccione los asientos");
        sala1.mostrarAsientos();
        System.out.println();
        for (int i = 0; i < obtenerNumeroBoletos(); i++) {
            do{
                System.out.printf("Boleto #%d\n",i+1);
                asiento=t.nextLine();
            }
            while(sala1.reservar(asiento));
        }
        //sala1.reservar("d");
        //t.close();
    }
}