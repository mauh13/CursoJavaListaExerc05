package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q02_PosOuNeg {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite qualquer numero inteiro:");
		int numer = leia.nextInt();
				
		if (numer < 0){
			System.out.println("Este n�mero � negativo.");
		} else if ( numer > 0 ){
			System.out.println("O n�mero inromado � �mpar.");
		} else {
			System.out.println("Zero � neutro.");
		}
		
		leia.close();
	}

}
