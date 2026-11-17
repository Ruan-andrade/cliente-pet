package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.application.ClienteDetalhadoResponse;
import br.com.petz.cliente_pet.cliente.domain.application.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.domain.application.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
