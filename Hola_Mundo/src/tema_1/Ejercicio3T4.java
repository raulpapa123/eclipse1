package tema_1;

import java.util.Scanner;

public class Ejercicio3T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		int dia;
		String dsemana;
		
		System.out.println("Escribe el día de la semana: ");
		dia = consola.nextInt();

		consola.close();
		
		switch (dia) {
		case 1: dsemana = ("Hoy es lunes");
		break;
		case 2: dsemana = ("Hoy es martes");
		break;
		case 3: dsemana = ("Hoy es miércoles");
		break;
		case 4: dsemana = ("Hoy es jueves");
		break;
		case 5: dsemana = ("Hoy es viernes");
		break;
		case 6: dsemana = ("Hoy es sábado");
		break;
		case 7: dsemana = ("Hoy es domingo");
		break;
		default: dsemana = ("Error, este día de la semana no existe");
		}
System.out.println(dsemana);
	}

}
