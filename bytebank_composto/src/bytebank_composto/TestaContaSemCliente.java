package bytebank_composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaMarcela = new Conta();
		Cliente marcela = new Cliente();
		
		System.out.println(contaMarcela.pegaSaldo());
		
		marcela.nome = "Marcela";
		
		System.out.println(marcela.nome);
		
	}
	
}
