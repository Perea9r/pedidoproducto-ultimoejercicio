package io.ruben.pedidoproducto.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.ruben.pedidoproducto.models.Pedido;
import io.ruben.pedidoproducto.repositories.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private RestTemplate restTemplate;

    private String productosUrl = "http://localhost:8080";

    @Override
    public double altaPedido(Pedido pedido) {
        Double precioUnitario = restTemplate
                .getForObject(productosUrl + "/producto/" + pedido.getCodigoProducto() + "/precio", Double.class);
        if (precioUnitario != null) {
            double total = precioUnitario * pedido.getUnidades();
            pedido.setTotal(total);
            pedido.setFecha(LocalDateTime.now());
            pedidoRepository.save(pedido);
            restTemplate.put(productosUrl + "/producto/" + pedido.getCodigoProducto() + "/stock?unidades="
                    + pedido.getUnidades(), null);
            return total;
        } else {
            throw new NullPointerException("No se pudo obtener el precio del producto");
        }
    }

    @Override
    public List<Pedido> obtenerPedidos() {
        return pedidoRepository.findAll();
    }
}
