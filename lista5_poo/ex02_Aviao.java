/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um 
 * objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

package PROGRAMACAOORIENTADA;

public class ex02_Aviao {
	
	String tipovoo;
	String modelo;
	double velocidadeDecolagem;
	double velocidadeMaxima;
	
	void liga()
	{
		System.out.println("O avi�o vai decolar");
	}
	void acelera (double quantidade)
	{
		double velocidadeNova = this.velocidadeDecolagem+quantidade;
		this.velocidadeDecolagem = velocidadeNova;
	}
	
	int decola()
	{
		if (this.velocidadeDecolagem<203)
		{
			return - 1;
			
		}
		
		
		if (this.velocidadeDecolagem>=203 && this.velocidadeDecolagem<278)
		{
			return 1;
		}
		
		return 2;
		
	}
	
}
