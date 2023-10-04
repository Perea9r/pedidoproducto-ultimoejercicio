package io.ruben.pedidoproducto.services;

import java.util.List;

import io.ruben.pedidoproducto.models.Pedido;

public interface PedidoService {
    double altaPedido(Pedido pedido);

    List<Pedido> obtenerPedidos();
}
