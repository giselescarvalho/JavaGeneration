/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
com o conteúdo ZERO.
 */


package Extras;

import java.util.*;

public class lista2_exercicio1lace {
	public static void main (String args[]) 
	{
		
		Scanner ler = new Scanner (System.in);
		double pesoMax = 50, pesoExc = 4.00, P, E, M;
		
		System.out.println("Entre com o peso dos tomates em kg: ");
		P = ler.nextInt();
		
		if (P>pesoMax)
		{
			E = P-pesoMax; 				//cálculo excesso
			M = E*pesoExc;				//cálcula o valor da multa
		}
		else
		{
			E = 0;
			M = 0;
		}
		
		System.out.println("O peso total foi de "+P+" kg, e o peso excedente foi de "+E+" kg.\nE a multa a ser paga será de R$ 4.00 por quilo, que totalizou uma multa de R$"+M);
		
	}
		
}
