package com.jared.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jared.modell.Producto;
import com.jared.repository.ProductoRepository;

@Service
public class ProductoserviceImpl implements Productoservice {

	
	@Autowired
	ProductoRepository proRepository;
	
	@Override
	public Producto findById(long id) {
		return proRepository.findById(id);
	}

	@Override
	public Optional<Producto> findByDescripcion(String descripcion) {
		return proRepository.findByDescripcion(descripcion);
	}

	@Override
	public void savePro(Producto pro) {
		proRepository.save(pro);
		
	}

	@Override
	public void updatePro(Producto pro) {
		proRepository.save(pro);
		
	}

	@Override
	public void deleteProById(long id) {
		proRepository.deleteById(id);
		
	}

	@Override
	public List<Producto> findAllPros() {
		return proRepository.findAll();
	}

	@Override
	public void deleteAllPros() {
		proRepository.deleteAll();
		
	}

	@Override
	public boolean isProExist(Producto pro) {
		return findByDescripcion(pro.getDescripcion())!=null;
	}
	
	
}
