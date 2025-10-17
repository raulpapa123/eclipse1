package T4R2;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int n1;
		int n2;
		n1=6660;
		int indice = 0;
		
		do{
		System.out.println("Escribe un codigo de 4 digitos: ");
		n2 = consola.nextInt(); 
		if (n1==n2){
			System.out.println("El codigo es correcto");
			indice = 3;
			}else{
			System.out.println("el codigo es incorrecto");
			}
		indice ++;
		} while(indice <= 3);
		
		consola.close();
	}
}