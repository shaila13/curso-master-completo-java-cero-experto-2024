package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.interfaces.AllRepository;

import java.util.*;

public class ClienteListRepository implements AllRepository {
    private List<Cliente> dataSource;

    public ClienteListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> getAllClients() {
        return dataSource;
    }

    @Override
    public Optional<Cliente> getClientById(Integer id) {
        return dataSource.stream().filter(cliente -> cliente.getId().equals(id)).findFirst();
    }

    @Override
    public void updateClient(Cliente cliente) {
        dataSource.stream().filter(cl -> cl.getId().equals(cliente.getId()))
                .findFirst()
                .ifPresent(clienteExistente -> {
                    clienteExistente.setNombre(cliente.getNombre());
                    clienteExistente.setApellido(cliente.getApellido());
                });
    }

    @Override
    public void createClient(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void deleteClientById(Integer id) {
        dataSource.remove(this.getClientById(id));
    }

    @Override
    public List<Cliente> getAllClients(int first, int last) {
        return dataSource.subList(first, last);
    }

    @Override
    public List<Cliente> getAllClients(String campo, Direccion dir) {
        Comparator<Cliente> comparator = switch (campo.toLowerCase()) {
            case "id" -> Comparator.comparing(Cliente::getId);
            case "nombre" -> Comparator.comparing(Cliente::getNombre);
            case "apellido" -> Comparator.comparing(Cliente::getApellido);
            default -> throw new IllegalArgumentException("Campo desconocido: " + campo);
        };

        if (Direccion.DESC.equals(dir)) {
            comparator = comparator.reversed();
        }

        dataSource.sort(comparator);
        return dataSource;
    }

    @Override
    public int getTotalNumberOfClients() {
        return dataSource.size();
    }
}
