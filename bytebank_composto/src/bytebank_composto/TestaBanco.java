package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "12345678912";
		paulo.profissao = "programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		contaPaulo.titular = paulo;
		
		System.out.println(contaPaulo.titular.nome);
		
	}
	
}
