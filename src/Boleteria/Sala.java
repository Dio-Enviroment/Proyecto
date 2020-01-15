package Boleteria;

/**
 * Sala
 */
public class Sala {
    private int numero;
    private boolean[][] asientos;
    private char[] filas;

    public Sala(int numero, int filas, int columnas) {
        int cont=0;
        this.numero = numero;
        this.asientos = new boolean[filas][columnas];
        this.filas=new char[filas];
        for (int i = 65; i <= 90; i++) {
            if(cont<filas){
                this.filas[cont]=(char) i;
                cont++;
            }
            else{
                break;
            }
        }

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j]=false;
            }
        }
    }

    public boolean reservar(String asiento) {
        int fila=obtenerFila(asiento.charAt(0));
        int columna;
        try {
            columna=Integer.parseInt(asiento.substring(1,2))-1;
        } catch (Exception e) {
            System.out.println("No existe ese asiento");
            return true;
        }
        if(fila != -1 && columna < asientos[0].length){
            if (asientos[fila][columna]==false) {
                asientos[fila][columna]=true;
                return false;
            }
            else{
                System.out.println("Ya esta ocupado ese asiento");
                return true;
            }
            
        }
        else{
            System.out.println("No existe ese asiento");
            return true;
        }
    }

    private int obtenerFila(char fila) {
        int num=-1;
        for (int i = 0; i < filas.length; i++) {
            if(filas[i]==Character.toUpperCase(fila)){
                num=i;
            }
        }
        return num;
    }

    public void mostrarAsientos() {
        System.out.printf("  ");
        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("%d ",i+1);
        }
        System.out.println();
        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("%S ",filas[i]);
            for (int j = 0; j < asientos[0].length; j++) {
                if(asientos[i][j]){
                    System.out.printf("X ");
                }
                else{
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
    }

    public int getNumero() {
        return numero;
    }
}