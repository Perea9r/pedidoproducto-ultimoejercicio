package io.ruben.pedidoproducto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.ruben.pedidoproducto.models.Pedido;
import io.ruben.pedidoproducto.services.PedidoService;

@RestController
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> altaPedido(@RequestBody Pedido pedido) {
        pedidoService.altaPedido(pedido);
        return ResponseEntity.ok(pedido);
    }

    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> obtenerPedidos() {
        List<Pedido> pedidos = pedidoService.obtenerPedidos();
        return ResponseEntity.ok(pedidos);
    }

}