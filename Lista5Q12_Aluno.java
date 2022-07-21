package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q12_Aluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informar o nome do aluno:");
		String nome = leia.nextLine();
		System.out.println("Informe a nota da primeira avalia��o:");
		float nota1 = leia.nextFloat();
		System.out.println("Informe a nota da segunda avalia��o:");
		float nota2 = leia.nextFloat();
		System.out.println("Informe a nota da terceira avalia��o:");
		float nota3 = leia.nextFloat();
		System.out.println("Informe a m�dia dos exerc�cios:");
		float nota4 = leia.nextFloat();
		
		float media = (nota1 + (nota2*2) + (nota3*3) + nota4)/7;
		
		System.out.print("O resultado de " + nome + " �: ");
		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media >= 7.5f && media < 9) {
			System.out.println("Conceito B");
		} else if (media >= 6 && media < 7.5f) {
			System.out.println("Conceito C");
		} else if (media < 6) {
			System.out.println("Conceito D");
		}

		leia.close();
		

	}

}
