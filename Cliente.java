package secao11;
//Protected
/*
 * O modificador Protected faz com que o elemento seja visivel somente dentro do mesmo pacote onde o elemento foi declarado
 * no caso ele é um padrao na falta de outro encapsulamento 
 *  */
public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		
	}
	
	 void dizer_oi() {
		System.out.println(this.nome + " está dizendo oi...");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}
