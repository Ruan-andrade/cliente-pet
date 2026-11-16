package br.com.petz.cliente_pet.cliente.domain.application.api;

import br.com.petz.cliente_pet.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public static List<ClienteListResponse> convert(List<Cliente> clientes) {
        return null;
    }
}
