package subsistema1.crm;

public class CRMService {
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.printf("Nome: %s , CEP: %s , Cidade: %s , Estado: %s",nome,cep,cidade,estado);
	}
	
	private CRMService() {
		super();
	}

}
