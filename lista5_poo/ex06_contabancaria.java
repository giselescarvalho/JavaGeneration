package PROGRAMACAOORIENTADA;

public class ex06_contabancaria {
		
		String cliente;
		String tipoConta;
		int agencia;
		int contaDestino;
		double valorRecebido;
		double valordepositado;
		
		void deposito()
		{
			System.out.println("É possível depositar");
		}
		void informacoes (int valordepositado)
		{
			double valorRecebido = valordepositado+0;
			this.valordepositado = valorRecebido;
		}
		
		int depositoFeito()
		{
			if (this.valordepositado<=0)
			{
				return - 1;
				
			}
			
			if (this.valordepositado>0 && this.valordepositado<5000)
			{
				return 1;
			}
			
			return 2;
			
		}
		
	}
