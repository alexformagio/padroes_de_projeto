package subsistema2.cep;

public class CEPApi {
	private static CEPApi instancia = new CEPApi();

	private CEPApi() {
		super();
	}
	
	public static CEPApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Socorro";
	}
	
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}	
}
