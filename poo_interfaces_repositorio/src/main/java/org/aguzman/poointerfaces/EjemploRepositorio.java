package org.aguzman.poointerfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.*;
import org.aguzman.poointerfaces.repositorio.interfaces.AllRepository;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        AllRepository repo = new ClienteListRepository();
        repo.createClient(new Cliente("Jano", "Pérez"));
        repo.createClient(new Cliente("Bea", "González"));
        repo.createClient(new Cliente("Luci", "Martínez"));
        repo.createClient(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.getAllClients();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = repo.getAllClients(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.getAllClients("apellido", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.updateClient(beaActualizar);
        var bea = repo.getClientById(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        repo.getAllClients("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.deleteClientById(2);
        repo.getAllClients().forEach(System.out::println);
        System.out.println("===== total ======");
        System.out.println(repo.getTotalNumberOfClients());

    }
}
