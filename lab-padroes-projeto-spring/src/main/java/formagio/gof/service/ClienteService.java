package formagio.gof.service;

import formagio.gof.model.Cliente;

public interface ClienteService {
	Iterable<Cliente> buscarTodos();
	Cliente buscaPorID(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
