package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();	
		segundaConta.saldo = 50;
		
		System.out.println(segundaConta.saldo);
		
	}
	
}
