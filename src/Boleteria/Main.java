package Boleteria;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("- - M I C I N E - -");
        System.out.println("Rodrigo Tufiño");
        //Teclado t = new Teclado();
        Cine miCine = new Cine();
        int opc = -1;
        do {
            System.out.println("\n+ + MENU PRINCIPAL + +");
            System.out.println("1. Mostrar cartelera");
            System.out.println("2. Mostrar sala");
            System.out.println("3. Comprar boletos");
            System.out.println("4. Salir");
            opc = t.getEntero("Ingrese su opción: ");
            switch (opc) {
            case 1:
                miCine.mostrarCartelera();
                break;
            case 2:
                miCine.mostrarSala();
                break;
            case 3:
                miCine.comparBoletos();
                break;
            case 4:
                System.out.println("Gracias por usar este programa");
                break;
            default:
                System.out.println("Opción inválida. Por favor,vuelva a intentar");
                break;
            }
        } while (opc != 4);
        System.out.println("\nPrograma finalizado...");
    }
}