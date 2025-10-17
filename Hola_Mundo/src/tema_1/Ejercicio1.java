package tema_1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 144;
		int y = 999;
		int suma;
		int resta;
		int multiplicacion;
		int division;

		String frases = "La suma de las dos variables es :";
		String fraser = "La resta de las dos variables es :";
		String frasem = "La multiplicación de las dos variables es :";
		String frased = "La división de las dos variables es :";

		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		//operaciones
		
		suma = x+y;
		resta = x-y;
		multiplicacion = x*y;
		division = x/y;
		
		System.out.println(frases+suma);
		System.out.println(fraser+resta);
		System.out.println(frasem+multiplicacion);
		System.out.println(frased+division);

	}

}
