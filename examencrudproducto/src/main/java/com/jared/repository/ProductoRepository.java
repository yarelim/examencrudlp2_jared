package com.jared.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jared.modell.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	Producto findById(long id);
	
	
	Optional<Producto> findByDescripcion(String descripcion);
  

}
