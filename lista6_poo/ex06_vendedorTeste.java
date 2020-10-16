package lista06_poo;

public class ex06_vendedorTeste {
public static void main (String args[]) {
	administrador ADM = new administrador("Jose","Rua dos bobos","11122233344",11111121,23,4000);
	ADM.gastoAjuda(1500);
	ADM.imprimainf();
	
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXX\n");
	
	vendedor vend = new vendedor("Paulo", null, null, 99999999, 30, 0, 40);

	
	
}
}
