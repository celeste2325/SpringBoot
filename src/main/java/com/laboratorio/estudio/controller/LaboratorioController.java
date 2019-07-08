package com.laboratorio.estudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.estudio.model.Estudio;
import com.laboratorio.estudio.repository.LaboratorioRepository;

@RestController
public class LaboratorioController {

	@Autowired
	private LaboratorioRepository laboratorioRepository;

	@GetMapping(path = "api/estudio/{nombreEstudio}")
	public ResponseEntity<List<Estudio>> getEstudioByNombre_estudio(@PathVariable(value = "nombreEstudio") String nombre_estudio) {

		List<Estudio> codigoEncontrado = laboratorioRepository.findByNombreEstudiosContaining(nombre_estudio);
		
		return ResponseEntity.ok(codigoEncontrado);
	}

}


