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
				System.out.println("A condi��o do seu IMC �: Abaixo do peso");
			} else if (imc >= 18.5 && imc <= 25) {
				System.out.println("A condi��o do seu IMC �: Peso normal");
			} else if (imc > 25 && imc <= 30) {
				System.out.println("A condi��o do seu IMC �: Acima do peso");
			} else {
				System.out.println("A condi��o do seu IMC �: Obeso");
			}

			leia.close();

			}

		}
