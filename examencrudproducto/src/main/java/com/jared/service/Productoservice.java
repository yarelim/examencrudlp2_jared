package com.jared.service;

import java.util.List;
import java.util.Optional;

import com.jared.modell.Producto;

public interface Productoservice {
	
	Producto findById (long id);  
	
	Optional<Producto> findByDescripcion(String descripcion);
	
	void savePro(Producto pro);
	
	void updatePro(Producto pro);
	
	void deleteProById(long id);
	
	List<Producto> findAllPros();
	
	void deleteAllPros();
	
	public boolean isProExist(Producto pro);

}
