package T4R4;

import java.util.Scanner;

public class Ejercicio50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int espacios = 3;
		Scanner consola = new Scanner(System.in);

		System.out.print("*");
		for (int i = 0; i < espacios; i++) {
			System.out.print("  ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");

		System.out.print("*");
		for (int i = 0; i < espacios; i++) {
			System.out.print("  ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("*");

		System.out.print("*");
		for (int i = 0; i < espacios; i++) {
			System.out.print("  ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");
		consola.close();
	}
}
