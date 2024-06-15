package org.aguzman.poointerfaces.repositorio.interfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.Direccion;

import java.util.List;

public interface SortedRepository {

    List<Cliente> getAllClients(String campo, Direccion dir);

}
