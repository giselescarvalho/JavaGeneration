/*6-	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
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
			System.out.println("Digite n�meros inteiros quaisquer \nPara sair digite 0");
			num = ler.nextInt();
			if(num%3 == 0 && num !=0) 
		{	
			soma=soma+num;
			cont ++;
		}
		} while (num!=0);
	
		media=soma/cont;
	 
		System.out.println("Foi/foram digitado(s) " + cont + " n�mero(s) m�ltiplo(s) de 3 e a m�dia desse(s) n�mero(s) � " + media);
	
	}
}
