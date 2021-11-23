import java.util.Scanner;

public class EscudosDelEjercitoRomano {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
	    int introNumber;
	    int totalEscudos;
	    int soldados;
	    int soldadosLaterales;
	    int numEscudosSuperior;
	    int numEscudosLaterales;

//	    Coge el numero de soldados.
	    introNumber = teclado.nextInt();

//	    Mientras el numero de entrada no sea 0 el prorgama sigue.
	    while (introNumber != 0) {
	    	
	    	totalEscudos = 0;
	    	soldados = introNumber;
	      
	    	while (soldados > 0) {
//	    		Calcula el numero de soldados de los laterales de la formación cuadrada + grande posible.
	    		soldadosLaterales = (int) Math.sqrt(soldados);
	        
//	    		Calcula el numero de escudos superiores.
	    		numEscudosSuperior = (int) Math.pow(soldadosLaterales, 2);
	        
//	    		Calcula el numero de escudos laterales.
	    		numEscudosLaterales = soldadosLaterales * 4;
	        
//	    		Suma el total de escudos.
	    		totalEscudos = totalEscudos + numEscudosSuperior + numEscudosLaterales;
	        
//	    		Calcula el resto de soldados que faltan ya que solo usan escudos superiores.
	    		soldados = soldados - numEscudosSuperior;

	    	}
	      
//	    	Printa el numero de escudos.
	    	System.out.println(totalEscudos);
	      
//	    	Coge el siguiente numero de soldados.
	    	introNumber = teclado.nextInt();
	      
	    }
	}
}