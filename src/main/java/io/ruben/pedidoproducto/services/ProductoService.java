package io.ruben.pedidoproducto.services;

import java.util.List;

import io.ruben.pedidoproducto.models.Producto;

public interface ProductoService {

    List<Producto> obtenerProductos();

    void actualizarStock(int codigoProducto, int unidades);

    Double obtenerPrecio(int codigoProducto);

}
