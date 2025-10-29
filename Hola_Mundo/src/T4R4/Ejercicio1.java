package T4R4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int numero1;

		do {
			System.out.println("Escribe un codigo de 4 digitos: ");
			numero1 = consola.nextInt();
		} while (numero1 > 0 || numero1 < 0);

		consola.close();
	}
}
