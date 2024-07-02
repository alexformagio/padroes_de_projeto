package formagio.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formagio.gof.model.Cliente;
import formagio.gof.model.ClienteRepository;
import formagio.gof.model.Endereco;
import formagio.gof.model.EnderecoRepository;
import formagio.gof.service.ClienteService;
import formagio.gof.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscaPorID(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);

	}


	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clientedb = clienteRepository.findById(id);
        if(clientedb.isPresent()) {
        	salvarClienteComCep(cliente);
        }
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);

	}

	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		}); 
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

}
