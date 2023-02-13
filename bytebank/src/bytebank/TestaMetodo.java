package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaEvaldo = new Conta();
		contaEvaldo.saldo = 100;
		contaEvaldo.deposita(50);
		
		System.out.println(contaEvaldo.saldo);
		
		contaEvaldo.saca(20);
		
		System.out.println(contaEvaldo.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(800, contaEvaldo);
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaEvaldo	.saldo);
		
	}
	
}
