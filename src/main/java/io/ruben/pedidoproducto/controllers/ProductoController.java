package io.ruben.pedidoproducto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.ruben.pedidoproducto.models.Producto;
import io.ruben.pedidoproducto.services.ProductoService;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> obtenerProductos() {
        List<Producto> productos = productoService.obtenerProductos();
        return ResponseEntity.ok(productos);
    }

    @PutMapping("/producto/{codigoProducto}/stock")
    public ResponseEntity<Void> actualizarStock(@PathVariable int codigoProducto, @RequestParam int unidades) {
        productoService.actualizarStock(codigoProducto, unidades);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/producto/{codigoProducto}/precio")
    public ResponseEntity<Double> obtenerPrecio(@PathVariable int codigoProducto) {
        Double precio = productoService.obtenerPrecio(codigoProducto);
        return ResponseEntity.ok(precio);
    }
}
