package tema_1;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		double cafe;
		double tostada;
		double total;
		System.out.print("\nPrecio del cafe: ");
		cafe = consola.nextDouble(); // meter el precio con coma, por ejemplo 1,10
		System.out.print("\nCantidad del iva: ");
		tostada = consola.nextDouble(); // meter el precio con coma, por ejemplo 1,40
		
		consola.close();

		total = cafe * (tostada/100) + cafe;
		System.out.println("\nLa cuenta es "+ (int)total + " euros");
	}

}
