package bytebank_composto;

public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 50032);
		conta.setNumero(1999);
		conta.setAgencia(125);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Evaldo");
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
	}
	
}
