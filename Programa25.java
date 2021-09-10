package secao11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente caio = new Cliente("Caio Ramos", "Rua sol do tropico, 198");
		Cliente maria = new Cliente("Maria da Silva" , "Avenida Gameleira Branca, 555");
		
		Conta conta_caio = new Conta(1, 100.0f, 500.0f, caio);
		Conta conta_maria = new Conta(2, 50.0f, 300.0f, maria);
		
		System.out.println("Saldo do Caio: " + conta_caio.getSaldo());
		System.out.println("Saldo do Maria: " + conta_maria.getSaldo());
		
		conta_caio.sacar(300);
		System.out.println("Saldo do Caio: " + conta_caio.getSaldo());
		
	}

}
