package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteDetalhadoResponse;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
