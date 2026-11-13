package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteResponse;
import br.com.petz.cliente_pet.reposytory.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[Inicia] ClienteApplicationService - criarCLiente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criarCLiente");
        return ClienteResponse.builder().
                idCliente(cliente
                        .getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[Inicia] ClienteApplicationService - buscaTodosClientes");
        log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
        return null;
    }
}
