package tema_1;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		double total;
		
		System.out.print("\nIngrese el número 1: ");
		numero1 = consola.nextInt();
		System.out.print("\nIngrese el número 2: ");
		numero2 = consola.nextInt();
		System.out.print("\nIngrese el número 3: ");
		numero3 = consola.nextInt();
		
		consola.close();

		total = (double)(numero1 + numero2 + numero3) / 3;
		System.out.println("\nLa media es "+ total);
	}

}
