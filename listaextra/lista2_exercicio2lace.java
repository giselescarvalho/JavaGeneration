/*2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.
*/
package Extras;

import java.util.*;

public class lista2_exercicio2lace {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int C, N, horaExtra;
		double salario, salarioSemHoraExtra = 500.00, valorHoraExtra = 20.00, salarioExc = 0;
		
		System.out.println("Entre com seu c�digo: ");
		C = ler.nextInt();
		System.out.println("Entre com o total de horas trabalhadas: ");
		N = ler.nextInt();
		
		if(N>50) 
		{
			horaExtra = N - 50;
			salario = salarioSemHoraExtra + (horaExtra*20.00);
			salarioExc = salario - salarioSemHoraExtra;
		}
		
		else
		{
			horaExtra = 0;
			salario = N*10.00;
		}
		
		System.out.println("O total de horas trabalhadas foi de "+N+" horas");
		System.out.println("O total de horas extras foi de "+horaExtra+" horas");
		System.out.println("O sal�rio ser� de R$ "+salario+" e o sal�rio excedente foi de R$ "+salarioExc);
	}
}
