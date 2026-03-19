package com.bn.clients.services;

import com.bn.clients.models.ClienteModel;
import com.bn.clients.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel criarCliente(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
