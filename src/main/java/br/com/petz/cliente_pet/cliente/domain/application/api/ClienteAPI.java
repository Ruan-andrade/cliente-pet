package br.com.petz.cliente_pet.cliente.domain.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ClienteListResponse> getTodosCliente();

    @GetMapping (value = "/{idCliente}")
    @ResponseStatus(HttpStatus.OK)
    ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);
}
