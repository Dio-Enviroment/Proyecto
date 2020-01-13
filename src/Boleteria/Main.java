package Boleteria;

import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner t=new Scanner(System.in);
        System.out.println("- - M I C I N E - -");
        Cine miCine = new Cine();
        int opc = -1;
        do {
            System.out.println("\n+ + MENU PRINCIPAL + +");
            System.out.println("1. Mostrar cartelera");
            System.out.println("2. Mostrar sala");
            System.out.println("3. Comprar boletos");
            System.out.println("4. Salir");
            System.out.printf("Ingrese su opción: ");
            opc=Integer.parseInt(t.nextLine());
            clearConsole();
            switch (opc) {
            case 1:
                miCine.mostrarCartelera();
                break;
            case 2:
                miCine.mostrarSala();
                break;
            case 3:
                miCine.comprarBoletos();
                break;
            case 4:
                System.out.println("Gracias por usar este programa");
                break;
            default:
                System.out.println("Opción inválida. Por favor,vuelva a intentar");
                break;
            }
            t.nextLine();
            clearConsole();
        } while (opc != 4);
        System.out.println("\nPrograma finalizado...");
        t.close();
    }

    private static void clearConsole() {
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception e){
            System.out.println(e);
        }   
    }
    //asdasdasdsadas
}

