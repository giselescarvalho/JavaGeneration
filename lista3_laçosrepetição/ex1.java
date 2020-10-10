/*1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
package exerciciosfor;

public class ex1 {
	public static void main (String args[])
	{
		int x;
		
		System.out.println("Esse programa informa número entre 1000 e 1999, que quando divididos por 11 tem resto igual a 5");
		
		for(x=1000; x<=1999; x++)
		{	
			if(x % 11 == 5) 
			{
				System.out.println("Resultado: "+ x);
			}
		}
	}
}
