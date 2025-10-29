package T4R4;

import java.util.Scanner;

public class EjercicioARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);

		String[]usuarios = new String[3];
		
		for (int i = 0; i<usuarios.length; i++) {
		System.out.println("Introduce el nombre del usuario: ");
		usuarios[i] = consola.nextLine();
		}
		
		for (int i = 0; i<usuarios.length; i++) {
		System.out.println("El nombre en la "+ i +" posición del array es: "+usuarios[i]);
		}		
		consola.close();
	}
}