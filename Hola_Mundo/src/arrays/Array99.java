package arrays;

import java.util.Scanner;

public class Array99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		String[] nombres = new String[3];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce el nombre: ");
			nombres[i] = consola.nextLine();
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce el nombre: ");
			nombres[i] = consola.nextLine();
		}
		
		for (int i = nombres.length - 1; i >= 0; i--) {
			System.out.println("El nombre en la " + i + " posición del array es: " + nombres[i]);
		}

		consola.close();
	}

}
