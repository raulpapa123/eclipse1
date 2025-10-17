package tema_1;

import java.util.Scanner;

public class Ejercicio1T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		int dia;
		String asignatura;
		
		System.out.println("Escribe el día de la semana: ");
		dia = consola.nextInt();

		consola.close();
		
		switch (dia) {
		case 1: asignatura = ("A primera hora toca Entornos de Desarrollo");
		break;
		case 2: asignatura = ("A primera hora toca Programación");
		break;
		case 3: asignatura = ("A primera hora toca IPE1");
		break;
		case 4: asignatura = ("A primera hora toca Lenguajes de Marcas");
		break;
		case 5: asignatura = ("A primera hora toca Sistemas Informáticos");
		break;
		default: asignatura = ("Error, este día no corresponde con un día de la semana");
		}
System.out.println(asignatura);
	}

}
