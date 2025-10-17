package tema_1;

import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);

		int numero1;
		int area;
		int perimetro;
		System.out.print("\nIngrese el número 1: ");

		consola.close();

		
		numero1 = consola.nextInt(); 

		area = numero1*numero1;
		perimetro = numero1*4;
		
System.out.println("el area es: "+ area +(" y el perímetro es: ")+ perimetro);	
}

}
