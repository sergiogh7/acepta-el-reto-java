import java.util.Scanner;
// Sergio G.

public class LosSaltosDeMario {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Numero de casos a analizar.
		int numeroCasos = teclado.nextInt();
		
		for (int i = 0; i < numeroCasos; i++) {
			
//			Numero de saltos de mario.
			int numeroSaltos = teclado.nextInt();
			
//			Asigna el tamaño al array de saltos.
			int saltos[] = new int[numeroSaltos];
			
//			Rellena el array llamando a la funcion.
			saltos = rellenarArray(saltos);
			
//			Printa el resultado llamando a la funcion.
			System.out.println(compruebaSaltos(saltos));
			
		}
	}
	
//	Funcion que recibe un array y lo rellena.
	public static int[] rellenarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = teclado.nextInt();
		}
		
		return array;
	}
	
//	Funcion que recibe un array y comprueba los saltos,
//	devuelve un String con el resultado.
	public static String compruebaSaltos(int array[]) {
		int saltosHAciaArriba = 0;
		int saltosHaciaAbajo = 0;
		
//		Recorre el array de saltos y comprueba si salta hacia arriba o hacia abajo.
		for (int i = 0, j=1; j < array.length; i++, j++) {
			
//			Si la posicion anterior a la actual es menor, salta hacia arriba.
			if(array[i] < array[j]) {
				saltosHAciaArriba++;
				
//			Si es mayor, salta hacia abajo.
			}else if(array[i] > array[j]) {
				saltosHaciaAbajo++;
				
			}
		}
//		Retorna resultado.
		return saltosHAciaArriba + " " + saltosHaciaAbajo;
	}
}