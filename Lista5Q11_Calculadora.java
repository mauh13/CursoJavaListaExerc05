package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q11_Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor do primeiro operando:");
		float primeiro = leia.nextFloat();
		System.out.println("Informe o valor do segundo operando:");
		float segundo = leia.nextFloat();
		
		System.out.println("Utilize do menu abaixo para escolher a opera��o:");
		System.out.println("+ para adi��o");
		System.out.println("- para subtra��o");
		System.out.println("* para multiplica��o");
		System.out.println("/ para divis�o");
		char opera = leia.next().charAt(0);
		
		switch (opera) {
			case '+':
				System.out.println("O resultado � " + (primeiro+segundo));
				break;
			case '-':
				System.out.println("O resultado � " + (primeiro-segundo));
				break;
			case '*':
				System.out.println("O resultado � " + (primeiro*segundo));
				break;
			case '/':
				System.out.println("O resultado � " + (primeiro/segundo));
				break;
			
		}

		leia.close();
		
		

	}

}
