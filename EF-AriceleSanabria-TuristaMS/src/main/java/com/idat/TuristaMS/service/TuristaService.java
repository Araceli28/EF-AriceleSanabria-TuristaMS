package com.idat.TuristaMS.service;

import java.util.List;

import com.idat.TuristaMS.dto.TuristaDTO;

public interface TuristaService {
	List<TuristaDTO> listar();
	void guardar(TuristaDTO turista);
}
