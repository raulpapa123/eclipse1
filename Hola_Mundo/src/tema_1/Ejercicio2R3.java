package tema_1;

import java.util.Scanner;

public class Ejercicio2R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		double numero1, numero2;
		double total;
		double porcentajeh;
		double porcentajem;
		
		System.out.print("\nIngrese el número de hombres: ");
		numero1 = consola.nextDouble(); 
		System.out.print("\nIngrese el número de mujeres: ");
		numero2 = consola.nextDouble();
		
		consola.close();
		
		total = (numero1+numero2);
		porcentajeh = (numero1/total)*100;
		porcentajem = (numero2/total)*100;
		
		System.out.printf("\nEl porcentaje de hombres es de %.2f", porcentajeh);
		System.out.println("% y el número es "+ numero1);
		System.out.printf("\nEl porcentaje de mujeres es de %.2f", porcentajem);
		System.out.println("% y el número es "+ numero2);
	}
	

}
