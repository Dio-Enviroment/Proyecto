package Boleteria;

import java.util.Scanner;

/**
 * Tools
 */
public class Tools {

	public static int soloInt(Scanner t,int rango) {
		boolean validado = true;
		String ingreso;
		int num = -1;
		do {
			ingreso = t.nextLine();
			try {
				num = Integer.parseInt(ingreso);
				validado = false;
			} catch (NumberFormatException e) {
				validado = true;
			}
			if (rango != -1 && (validado == true || (validado == false && num < 1 || num > rango))) {
				System.out.printf("Ingrese solo numeros (1-%d): \n", rango);
				validado = true;
			} else if (rango == -1 && (validado == true || (validado == false && num < 1))) {
				System.out.printf("Ingrese solo numeros (1-..): \n", rango);
				validado = true;
			}
		} while (validado);
		return num;
	}

	public static void clearConsole() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}