package modulo8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner entrada = new Scanner (System.in);
		
		double salario, abono, novoSalario;
		
		System.out.println("Digite seu salário: ");
		salario = entrada.nextDouble();
		
		System.out.println("Digite seu abono: ");
		abono = entrada.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: R$ %.2f", novoSalario);
		
	}

}
