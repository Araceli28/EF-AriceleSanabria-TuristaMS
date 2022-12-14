package com.idat.TuristaMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.TuristaMS.dto.TuristaDTO;
import com.idat.TuristaMS.service.TuristaService;

@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {
	@Autowired
	private TuristaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<TuristaDTO> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody TuristaDTO dto) {
		service.guardar(dto);
	}
}
