package arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int[]numeros = new int[10];
		
		for (int i = 0; i<numeros.length; i++) {
		System.out.println("Introduce el número entero: ");
		numeros[i] = consola.nextInt();
		}
		
		for (int i = numeros.length-1; i>=0; i--) {
		System.out.println("El nombre en la "+ i +" posición del array es: "+numeros[i]);
		}		
		consola.close();
	}

}
