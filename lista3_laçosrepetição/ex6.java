/*6-	Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
package exerciciosfor;

import java.util.*;

public class ex6 {
	public static void main(String args[])
	{
		Scanner ler= new Scanner (System.in);
	
		int num, soma=0, cont=0;
		double media=0;
	
		do
		{
			System.out.println("Digite números inteiros quaisquer \nPara sair digite 0");
			num = ler.nextInt();
			if(num%3 == 0 && num !=0) 
		{	
			soma=soma+num;
			cont ++;
		}
		} while (num!=0);
	
		media=soma/cont;
	 
		System.out.println("Foi/foram digitado(s) " + cont + " número(s) múltiplo(s) de 3 e a média desse(s) número(s) é " + media);
	
	}
}
