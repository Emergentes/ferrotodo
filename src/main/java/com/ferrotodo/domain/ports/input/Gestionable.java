package com.ferrotodo.domain.ports.input;

import com.ferrotodo.domain.entities.Administrador;
import com.ferrotodo.domain.entities.Ferreteria;
import com.ferrotodo.domain.entities.Vendedor;

import java.util.List;

public interface Gestionable extends FerreteriaCrudable, AdministradorCrudable, VendedorCrudable {

}
