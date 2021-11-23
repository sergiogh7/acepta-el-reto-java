import java.util.Scanner;
// Sergio G.

public class EsMatrizIdentidad {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Boolean que valida matrices.
		boolean matrizValida  = true ;
		
//		Boolean que se encarga de que el programa siga o termine.
		boolean continuar = true;
		
//		Mientras matrizValidada siga devolviendo true...
		while (continuar) {
			
//			Primer valor del input que trae la dimension de la matriz.
			int dimensionMatriz = input.nextInt();
			
//			En caso de que entre un 0 termina el programa.
			if (dimensionMatriz == 0) {
				continuar = false;
			
//			En caso de tener un valor > 0 el programa continua.
			}else {
				
//				Declara la matriz con sus dimensiones.
				int[][] matriz = new int[dimensionMatriz][dimensionMatriz];
				
//				Llama a la funcion que rellena la matriz.
				rellenarMatriz(matriz);
				
//				Recoge el valor del boolean retornado del validador de matrices.
				matrizValida = validarMatriz(matriz);
				
//				Printa mensaje.
				System.out.println( matrizValida ? "SI" : "NO" );
		    
			}
		}
	}
	
//	Funcion que recibe una matriz y la rellena, luego la retorna.
	public static int[][] rellenarMatriz(int[][]matriz) {
		
//		Filas.
		for (int i = 0; i < matriz.length; i++) {
//			Columnas.
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(input.next());
				
			}
		}
		
//		Retorna.
		return matriz;
	}
	
//	Funcion que recibe una matriz y comprueba si es valida o no retornando true/false.
	public static boolean validarMatriz(int[][] matriz) {
		
		boolean validar = true;
		
//		Recorre la matriz para comprobar si es valida.
		for (int i = 0; i < matriz.length; i++) {
			
//			Para comprobar la diagonal basta con mirar el mismo valor tanto de fila como columna.
//			Si es diferente a 0 retorna false.
			if(matriz[i][i] != 1) {
				return validar = false;
				
			}
			
//			Comprueba el resto de casos que no sea la diagonal.
			for (int j = 0; j < matriz.length; j++) {
				
//				Si en la posicion que no es diagonal hay algo diferente a un 0 retorna false.
				if(i != j && matriz[i][j] != 0){
					return validar = false;
				}
			}
		}
		
		return validar;
	}
}