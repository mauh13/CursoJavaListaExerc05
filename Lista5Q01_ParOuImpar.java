package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q01_ParOuImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
						
		System.out.print("Digite um valor inteiro e positivo:");
		int numer = leia.nextInt();
		
		
		if (numer % 2 == 0){
			System.out.println("O n�mero informado � par.");
		} else {
			System.out.println("O n�mero inromado � �mpar.");
		}
				
		
		leia.close();

	}

}
