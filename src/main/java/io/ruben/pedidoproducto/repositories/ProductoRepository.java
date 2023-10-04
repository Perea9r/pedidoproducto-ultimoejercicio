package io.ruben.pedidoproducto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ruben.pedidoproducto.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
