package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q04_Produto {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	System.out.println("Por gentileza digite o código do produto:");
	int codigo = leia.nextInt();
	
	if (codigo == 1) {
		System.out.println("Alimento não-perecível");
	} else if (codigo >= 2 && codigo <= 4) {
		System.out.println("Alimento perecível");
	} else if (codigo == 5 || codigo == 6) {
		System.out.println("Vestuário");
	} else if (codigo == 7) {
		System.out.println("Higiene pessoal");				
	} else if (codigo >= 8 && codigo <= 15) {
		System.out.println("Limpeza e utensílios domésticos");
	} else {
		System.out.println("Inválido");
	}
	
	leia.close();
	}

}
