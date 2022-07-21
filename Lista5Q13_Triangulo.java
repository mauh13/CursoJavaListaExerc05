package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q13_Triangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos classificar um tri�ngulo (figura composta por 3 lados)");
		System.out.println("informe um numero inteiro para o primeiro lado:");
		int lado1 = leia.nextInt();
		System.out.println("informe um numero inteiro para o segundo lado:");
		int lado2 = leia.nextInt();
		System.out.println("informe um numero inteiro para o terceiro lado:");
		int lado3 = leia.nextInt();

		if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2) {
			System.out.print("Estes n�meros foram um tri�ngulo: ");
			if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
			System.out.println("IS�SCELES");
			} else if (lado1==lado2 && lado1==lado3) {
			System.out.println("EQUIL�TERO");
			} else {
			System.out.println("ESCALENO");
			}
		} else {
			System.out.println("Estes n�meros n�o formam um tri�ngulo.");
		}
		
		leia.close();

	}

}
