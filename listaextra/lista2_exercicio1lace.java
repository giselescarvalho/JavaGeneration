/*1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
com o conte�do ZERO.
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
			E = P-pesoMax; 				//c�lculo excesso
			M = E*pesoExc;				//c�lcula o valor da multa
		}
		else
		{
			E = 0;
			M = 0;
		}
		
		System.out.println("O peso total foi de "+P+" kg, e o peso excedente foi de "+E+" kg.\nE a multa a ser paga ser� de R$ 4.00 por quilo, que totalizou uma multa de R$"+M);
		
	}
		
}
