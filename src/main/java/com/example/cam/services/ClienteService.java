package com.example.cam.services;

import com.example.cam.models.ClienteEntity;
import com.example.cam.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    //Listar todos
    public List<ClienteEntity> obtenerTodos(){
        return clienteRepository.findAll();
    }

    public ClienteEntity guardarCliente(ClienteEntity cliente){
        return clienteRepository.save(cliente);
    }
}
