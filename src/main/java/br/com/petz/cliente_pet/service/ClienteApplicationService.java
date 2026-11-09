package br.com.petz.cliente_pet.service;

import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.domain.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
    log.info("[Inicia] ClienteApplicationService - criarCLiente");
    log.info("[finaliza] ClienteApplicationService - criarCLiente");
        return null;
    }
}
