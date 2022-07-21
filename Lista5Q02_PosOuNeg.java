package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q02_PosOuNeg {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite qualquer numero inteiro:");
		int numer = leia.nextInt();
				
		if (numer < 0){
			System.out.println("Este número é negativo.");
		} else if ( numer > 0 ){
			System.out.println("O número inromado é ímpar.");
		} else {
			System.out.println("Zero é neutro.");
		}
		
		leia.close();
	}

}
