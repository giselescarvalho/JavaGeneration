package PROGRAMACAOORIENTADA;


import java.util.*;

public class ex06_testecontabancaria {
	public static void main (String[] args)
	{
		ex06_contabancaria novodeposito = new ex06_contabancaria();
		
		novodeposito.cliente = "Maria Silva";
		novodeposito.tipoConta = "Corrente";
		novodeposito.agencia = 123450;      
		
		novodeposito.depositoFeito();
		
		novodeposito.informacoes(330);
		System.out.println(novodeposito.valordepositado);

		
	}

}
