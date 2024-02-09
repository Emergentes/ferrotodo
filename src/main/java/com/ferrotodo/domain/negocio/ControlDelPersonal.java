package com.ferrotodo.port;

import com.ferrotodo.domain.entities.*;

public interface ControlDelPersonal {

    void agregarAdministrador(Administrador adm);
    void editarAdministrador(Administrador adm);
    Administrador econtrarAdministrador(Long idAdmin);

    void agregarVendedor(Vendedor vndr);
    void editarVendedor(Vendedor vndr);
    Vendedor econtrarVendedor(Long idVendedor);

    void agregarCliente(Cliente cliente);
    void editarCliente(Cliente cliente);
    Cliente encontrarCliente(Long idCliente);

    void agregarProveedor(Proveedor proveedor);
    void editarProveedor(Proveedor proveedor);
    Proveedor encontrarProveedor(Proveedor idProveedor);

    void agregarProducto(Producto producto);
    void editarProducto(Producto producto);
    Producto agregarProducto(Long idPoducto);

    void agregarFerreteria(Ferreteria ferreteria);
    void editarFerreteria(Ferreteria ferreteria);
    Ferreteria agregarFerreteria(Long idFerreteria);

    //Agremaremos mas si es necesario

}
