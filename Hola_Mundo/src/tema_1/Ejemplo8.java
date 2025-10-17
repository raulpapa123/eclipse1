package tema_1;

import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner console = new Scanner(System.in);
		
		Double nu1,nu2;

		
		nu2=(double) 18;
		
		System.out.println("Escribe su edad: ");
		nu1 = console.nextDouble();
		
		console.close();
		
		String i = nu1>=nu2?"Mayor de edad ":"Menor de edad ";
		System.out.println(i);
		
	}
}
