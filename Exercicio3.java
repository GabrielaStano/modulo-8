package modulo8;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS

		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite seu salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno");
		adicionalNoturno = leia.nextShort();
		
		System.out.println("Digite seu adicional horas extras: ");
		horasExtras = leia.nextShort();
		
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextShort();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.printf("Salário líquido: %.2f", salarioLiquido);
		
		
	}

}
