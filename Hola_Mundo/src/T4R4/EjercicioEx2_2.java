package T4R4;

import java.util.Scanner;

public class EjercicioEx2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		int opcion;
		int nvalores = 0;
		int mayordiez = 0;
		int numero1;
		int totalval = 0;
		int promedio = 0;
		int contador = nvalores;
		
		System.out.println("------- OPCIONES -------");
		System.out.println("1.Carga de valores");
		System.out.println("2. Visualiza los pares de un rango de valores");
		System.out.println("------------------------");
		System.out.println("Que opción va a elegir?: ");
		opcion = consola.nextInt();
		
		switch (opcion) {
		case 1: { 
			System.out.println("Cuantos valores vas a poner?: ");
			nvalores = consola.nextInt();
			for (contador=0+contador; contador>0; contador--) {
			System.out.println("Escribe un valor: ");
			numero1 = consola.nextInt();
			totalval = totalval+numero1;
			promedio = totalval/nvalores;

			if (numero1>10) {
				mayordiez = mayordiez+1;
			}}
			System.out.println("El total de la suma de los valores es: "+ totalval);
			System.out.println("El promedio de los valores es: "+ promedio);
			System.out.println("El número de valores mayor a diez es de: "+ mayordiez);
		}
		
		break;
		case 2:
		break;
		default: System.out.println("la opción elegida no es válida");
		}
	consola.close();
	}
}
