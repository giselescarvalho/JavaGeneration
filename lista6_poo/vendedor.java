package lista06_poo;
import java.util.*;							
	
public class vendedor extends Pessoa {			//nao retorna
	private double valorVenda;
	private double comissao;
	double valorRecebido; 
	double valor;
	Scanner ler = new Scanner(System.in);
	
	public vendedor (String nome, String endereco, String Cpf, int Telefone, int idade, double valorVenda, double comissao) {
		super(nome, endereco, Cpf, Telefone, idade);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double somaVenda() {
		do {
			System.out.println("Diga o valor do produto ");
			valor = ler.nextDouble();
			valorVenda =  valorVenda+valor;
			
		} while(valor>0);
	return valor;
	}
	
	public void porcentagem () {
		valorRecebido = (valorVenda*comissao)/100;
	}
	 
	public void imprima() {
		
		System.out.printf("Nome: ",getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("O valor das vendas foi de "+valorVenda);
		System.out.println("E o valor da comissão será"+valorRecebido);
	}
	
}
