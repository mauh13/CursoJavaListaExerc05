package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q04_Produto {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	System.out.println("Por gentileza digite o c�digo do produto:");
	int codigo = leia.nextInt();
	
	if (codigo == 1) {
		System.out.println("Alimento n�o-perec�vel");
	} else if (codigo >= 2 && codigo <= 4) {
		System.out.println("Alimento perec�vel");
	} else if (codigo == 5 || codigo == 6) {
		System.out.println("Vestu�rio");
	} else if (codigo == 7) {
		System.out.println("Higiene pessoal");				
	} else if (codigo >= 8 && codigo <= 15) {
		System.out.println("Limpeza e utens�lios dom�sticos");
	} else {
		System.out.println("Inv�lido");
	}
	
	leia.close();
	}

}
