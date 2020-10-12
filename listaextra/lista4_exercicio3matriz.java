package Extras;

import java.util.*;

import java.util.Scanner;

public class exercicio3matriz {
	public static void main (String args[])
	{
		
	int linha=4,coluna=6;
	int[][] n1 = new int [4][6];
	int[][] n2 = new int[4][6];
	int[][] m1 = new int[4][6];
	int[][] m2 = new int[4][6];
	//int n1[4][6],n2[4][6],m1[4][6],m2[4][6],
	int i,j,somadig=0,maior=0;
	Scanner ler = new Scanner(System.in);
	
	for(i=0;i<4;i++)
	{
		for(j=0;j<6;j++)
		{
			System.out.println("Entre com N1: ");
			n1[i][j] = ler.nextInt();
			System.out.println("Entre com N2: ");
			n2[i][j] = ler.nextInt();
			
			if(i==j) {
				somadig = somadig + n1[i][j];
				System.out.println("\nValor diagonal principal: " + n1[i][j]);
				System.out.println("Estou na linha: "+ i +" e na coluna: "+ j);
				
			}
			
			if(maior == n1[i][j]);
			{
				maior = n1[i][j];
			}
			
			m1[i][j] = n1[i][j] + n2[i][j];
			m2[i][j] = n1[i][j] - n2[i][j];
		
		}
		
	}		
	System.out.println("A soma dos elementos da mesma posição de N1 e N2: ");
	for(i=0;i<4;i++)
	{
		for(j=0;j<6;j++)
		{
			System.out.printf(" ["+m1[i][j]+"] ");
		}
		System.out.println("\n");
	}
	
	System.out.println("A diferença dos elementos de mesma posição em N1 e N2: \n");
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.printf(" ["+m2[i][j]+"] ");
		}
		System.out.println("\n");
	}
	
}
	
	
}
