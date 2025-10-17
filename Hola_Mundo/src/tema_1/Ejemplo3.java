package tema_1;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		String numero1;
		String numero2;
		System.out.print("\nIngrese el número 1: ");
		numero1 = consola.nextLine(); // meter el precio con coma, por ejemplo 1,10
		System.out.print("\nIngrese el número 2: ");
		numero2 = consola.nextLine(); // meter el precio con coma, por ejemplo 1,40
		
		consola.close();

		int numEntero = Integer.parseInt(numero1);
		int numEntero2 = Integer.parseInt(numero2);
		System.out.println("\nLa cuenta es "+ numEntero * numEntero2);
	}

	
}
