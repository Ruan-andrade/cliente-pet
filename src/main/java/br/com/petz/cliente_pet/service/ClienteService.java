package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
