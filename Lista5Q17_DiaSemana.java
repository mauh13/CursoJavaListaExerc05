package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q17_DiaSemana {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero de 1 a 7:");
		int dia = leia.nextInt();
		
		switch(dia) {
			case 1: // se texto usar aspas duplas para string e simples para char
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;	
			case 3:
				System.out.println("Ter�a-feira");
				break;	
			case 4:
				System.out.println("Quarta-feira");
				break;	
			case 5:
				System.out.println("Quinta-feira");
				break;	
			case 6:
				System.out.println("Sexta-feira");
				break;	
			case 7:
				System.out.println("S�bado");
				break;	
			default: 
				System.out.println("O n�mero n�o corresponde ao solicitado.");
							
				
		}
		

		leia.close();
	}

}
