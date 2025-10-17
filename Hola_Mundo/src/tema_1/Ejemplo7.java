package tema_1;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		double numero1;
		double interes;
		double total;
		
		System.out.print("\nIngrese el número 1: ");
		numero1 = consola.nextDouble(); 
		System.out.print("\nIngrese el interés: ");
		interes = consola.nextDouble(); 

		total = numero1+(numero1*(interes/100));
		
		consola.close();
		
		System.out.println("el dinero al final de año es: "+ total);	
	}

}
