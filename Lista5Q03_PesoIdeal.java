package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q03_PesoIdeal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Olá, favor informar o seu sexo (m/f):");
		char sexo = leia.next().charAt(0);
		System.out.print("Agora informe sua altura em metros:");
		float altura = leia.nextFloat();
		
		if (sexo == 'm' || sexo == 'M') {
			System.out.println("O seu peso ideal é " + String.format("%.2f",((72.7f*altura)-58)) + " quilos.");	
		} else if (sexo == 'f' || sexo == 'F') {
			System.out.println("O seu peso ideal é " + ((62.1f*altura)-44.7f) + " quilos.");
		} else {
			System.out.println("Resposta errada.");
		}
		
		leia.close();
	}

}
