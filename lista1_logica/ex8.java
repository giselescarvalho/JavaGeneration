/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos 
 * (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um 
 * sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. */

package PacoteJava;

import java.util.Scanner;

public class ex8 {
	public static void main (String[] args)
	{
		double custoFabrica, custoConsumidor, x, y; 
		double pdistribuidor = 1.28, impostos = 1.45;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor do custo de f�brica: ");
		custoFabrica = ler.nextInt();
		
		x = custoFabrica * pdistribuidor ;
		y = custoFabrica * impostos;
	
		custoConsumidor = x + y + custoFabrica;
		
			
		System.out.printf("O valor do carro para o consumidor �: "+ custoConsumidor + " reais");
		
	}
}
