/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
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
		
		System.out.println("Entre com seu código: ");
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
		System.out.println("O salário será de R$ "+salario+" e o salário excedente foi de R$ "+salarioExc);
	}
}
