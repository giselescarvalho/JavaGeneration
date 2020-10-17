package lista7_herancaEpolimorfismo;

public class TesteAnimais {
	public static void main (String[] args)
	{
		cachorro dog = new cachorro("Yankee", "Wolf wolf", 5, "latir");
		
		cavalo horse = new cavalo("little poney", "hiinn in in ", 1, "Trotar");
				
		preguica bicho = new preguica("Bichinho", "aaaaaaa", 1, "devaga");
		
		
		dog.imprimir();
		horse.imprimir();
		bicho.imprimir();
		
	}
}