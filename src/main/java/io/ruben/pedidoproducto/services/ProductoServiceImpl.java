package io.ruben.pedidoproducto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ruben.pedidoproducto.models.Producto;
import io.ruben.pedidoproducto.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void actualizarStock(int codigoProducto, int unidades) {
        Optional<Producto> productoOptional = productoRepository.findById(codigoProducto);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            int stockActualizado = producto.getStock() - unidades;
            producto.setStock(stockActualizado);
            productoRepository.save(producto);
        } else {
            throw new NullPointerException("No se pudo encontrar el producto con código " + codigoProducto);
        }
    }

    @Override
    public Double obtenerPrecio(int codigoProducto) {
        Optional<Producto> productoOptional = productoRepository.findById(codigoProducto);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            return producto.getPrecioUnitario();
        } else {
            throw new NullPointerException("No se pudo encontrar el producto con código " + codigoProducto);
        }
    }
}
