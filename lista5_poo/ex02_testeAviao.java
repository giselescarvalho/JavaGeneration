package PROGRAMACAOORIENTADA;

public class ex02_testeAviao {
	public static void main (String args[])
	{
		ex02_Aviao novoAviao = new ex02_Aviao();
		novoAviao.tipovoo = "voo direto";
		novoAviao.modelo = "Boeing 737";
		novoAviao.velocidadeDecolagem = 230;      //valor que pode ser utilizado em descolagem, dependendo do modelo
		
		
		novoAviao.liga();
		
		novoAviao.acelera(0);
		System.out.println(novoAviao.velocidadeDecolagem);

	}

}
