package br.com.petz.cliente_pet.cliente.domain.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ClienteResponse postCliente(@RequestBody ClienteRequest clienteRequest);
}
