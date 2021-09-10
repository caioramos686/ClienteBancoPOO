package secao11;

/*
	Getters e Setters

Getters 
	- é um método publico que serve para consultar dados;
    - a nomenclatura desses metodos é getNome_do_atributo()

*/
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {
		this.saldo = this.saldo - valor;  
		System.out.println("Saque realizado com Sucesso");
		} else System.out.println("Saldo insuficiente");
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	@Override
		public String toString() {
			return "O Saldo da conta é: " + this.getSaldo();
		}
	
	@Override
		public boolean equals(Object obj) {
			Conta verificar = (Conta) obj;
			return verificar.getSaldo() == this.getSaldo();
		}
	
	
}
