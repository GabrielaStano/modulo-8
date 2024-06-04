package modulo8;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		float[] numeros = new float[4];
		float diferenca;
		
		for(int i=0; i<4; i++ ) {
			System.out.printf("Digite o número %d: ", i + 1);
			numeros[i] = leia.nextFloat();
		}
		
		diferenca = (numeros[0]*numeros[1])-(numeros[2]*numeros[3]);
		System.out.printf("Difenreça; %.1f", diferenca);
		
	
	}
}





/*
  
 OUTRA OPÇÃO DE CÓDIGO, MAIS SIMPLIFICADA.
  
 package modulo8;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		float numero1, numero2, numero3,numero4, diferenca;
		Scanner leia = new Scanner (System.in);
	
		System.out.println("Número 1: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Número 2: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Número 3: ");
		numero3 = leia.nextFloat();
		
		System.out.println("Número 4 : ");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3*numero4);
		
		System.out.printf("Diferença: %.1f", diferenca);
		
		
	
	}
}
*/


