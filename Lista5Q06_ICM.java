package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q06_ICM {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);

			System.out.println("Por gentileza informe sua altura:");
			float altura = leia.nextFloat();
			System.out.println("Por gentileza informe seu peso:");
			float peso = leia.nextFloat();
			float imc = peso/(altura*altura);
			
			if (imc < 18.5) {
				System.out.println("A condição do seu IMC é: Abaixo do peso");
			} else if (imc >= 18.5 && imc <= 25) {
				System.out.println("A condição do seu IMC é: Peso normal");
			} else if (imc > 25 && imc <= 30) {
				System.out.println("A condição do seu IMC é: Acima do peso");
			} else {
				System.out.println("A condição do seu IMC é: Obeso");
			}

			leia.close();

			}

		}
