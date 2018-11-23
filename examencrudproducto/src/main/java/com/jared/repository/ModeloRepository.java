package com.jared.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jared.modell.Modelo;


public interface ModeloRepository extends JpaRepository<Modelo, Long> {
	
	Modelo findByIdModelo(String idModelo);

}
