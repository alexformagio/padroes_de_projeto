package formagio.gof.facade;

import subsistema1.crm.CRMService;
import subsistema2.cep.CEPApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CEPApi.getInstancia().recuperarCidade(cep);
		String estado = CEPApi.getInstancia().recuperarEstado(cep);
		CRMService.gravarCliente(nome, cep, cidade, estado);
	}
}
