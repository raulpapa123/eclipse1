package tema_1;

import java.util.Scanner;

public class Ejercicio1R3 {

	public static void main(String[] args) {

	Scanner consola = new Scanner(System.in);
	double numero1, numero2, numero3;
	double exf, trf;
	double total;
		
	System.out.print("\nIngrese el número 1: ");
	numero1 = consola.nextDouble(); 
	System.out.print("\nIngrese el número 2: ");
	numero2 = consola.nextDouble();
	System.out.print("\nIngrese el número 3: ");
	numero3 = consola.nextDouble();
	System.out.print("\nIngrese el examen final: ");
	exf = consola.nextDouble(); 
	System.out.print("\nIngrese el trabajo final: ");
	trf = consola.nextDouble(); 

	consola.close();
	
	total = ((numero1 + numero2 + numero3)/3)*0.55+(exf)*0.3+(trf)*0.15;
	System.out.println("La nota de los exámenes es "+ numero1 + (", ") + numero2 + (", ") + numero3);
	System.out.println("La nota del examen final es "+ exf);
	System.out.println("La nota del examen final es "+ trf);
	System.out.println("La nota final es "+ total);

	}

}
