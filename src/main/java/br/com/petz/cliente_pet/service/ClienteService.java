package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> buscaTodosClientes();
}
