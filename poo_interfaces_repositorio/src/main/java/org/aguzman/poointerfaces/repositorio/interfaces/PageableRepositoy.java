package org.aguzman.poointerfaces.repositorio.interfaces;

import org.aguzman.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PageableRepositoy {

    List<Cliente> getAllClients(int first, int last);
}
