package T4R4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in)) {
			double numero1;
			int contador;
			double sumatotal = 0;
					for (contador = 0; contador < 15; contador++) {
						System.out.println("Escribe un número");
						numero1 = consola.nextDouble();
						sumatotal += numero1;			
					}
					System.out.println("La suma total de los 15 números es: " + sumatotal);
					consola.close();
		}

	}
 
}
