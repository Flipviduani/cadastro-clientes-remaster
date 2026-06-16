package viduink.services;

import viduink.entities.Cliente;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClienteService {

    public void prepararCadastro(Cliente cliente) {

        cliente.setId(UUID.randomUUID());
        cliente.setDataHoraCadastro(LocalDateTime.now());
    }
}
