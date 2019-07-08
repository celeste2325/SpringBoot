package com.laboratorio.estudio.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.laboratorio.estudio.model.Estudio;

public interface LaboratorioRepository extends Repository<Estudio,Integer> {
	
	public List<Estudio> findByNombreEstudiosContaining(String nombre_estudios);

}
