package org.aguzman.poointerfaces.repositorio.interfaces;

import org.aguzman.poointerfaces.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface CrudRepository {

    List<Cliente> getAllClients();
    Optional<Cliente> getClientById(Integer id);
    void updateClient(Cliente cliente);
    void createClient(Cliente cliente);
    void deleteClientById(Integer id);

}
