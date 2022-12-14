package com.idat.TuristaMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.TuristaMS.model.Turista;
import com.idat.TuristaMS.dto.TuristaDTO;
import com.idat.TuristaMS.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService{
	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listado = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCodigo(turista.getIdTurista());
			dto.setNombre(turista.getNombreTurista());
			dto.setCelular(turista.getNroCelular());
			dto.setDireccion(turista.getDireccion());
			listado.add(dto);
		}
		
		return listado;
	}
	
	@Override
	public void guardar(TuristaDTO turista) {
		
		Turista tur = new Turista();
		tur.setIdTurista(turista.getCodigo());
		tur.setNombreTurista(turista.getNombre());
		tur.setNroCelular(turista.getCelular());
		tur.setDireccion(turista.getDireccion());
		
		repository.save(tur);
	}
}
