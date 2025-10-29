package T4R4;

import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner consola = new Scanner(System.in);

		int nalumnos;
		int costo;
		int total;
		System.out.println("Cuantos alumnos van?: ");
		nalumnos = consola.nextInt();
		if (nalumnos>=100) {
			costo = 65;
			total = nalumnos * costo;
			System.out.println("Se tendrá que pagar en total: "+ total);
			System.out.println("Cada alumno pagará: "+costo);
		}
		else if (nalumnos>=50) {
			costo = 70;
			total = nalumnos * costo;
			System.out.println("Se tendrá que pagar en total: "+ total);
			System.out.println("Cada alumno pagará: "+costo);
		}
		else if (nalumnos>=30) {
			costo = 95;
			total = nalumnos * costo;
			System.out.println("Se tendrá que pagar en total: "+ total);
			System.out.println("Cada alumno pagará: "+costo);
	}
		else if (nalumnos<30) {
			costo = 4000;
			total = costo/nalumnos;
			System.out.println("Cada alumno tiene que pagar: "+ total);
	}
		consola.close();
}}
