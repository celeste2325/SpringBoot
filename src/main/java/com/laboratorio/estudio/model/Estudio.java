package com.laboratorio.estudio.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estudios database table.
 * 
 */
@Entity
@Table(name="estudios")
@NamedQuery(name="Estudio.findAll", query="SELECT e FROM Estudio e")
public class Estudio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_estudios")
	private Integer idEstudios;

	@Column(name="codigo_glyms_estudio")
	private Integer codigoGlymsEstudio;

	@Column(name="nombre_estudios")
	private String nombreEstudios;
	
	@Column(name="se_realiza_estudio")
	private Boolean se_realiza_estudio;

	@Column(name="sucursales")
	private String sucursales;

	public Estudio() {
	}

	public Integer getIdEstudios() {
		return this.idEstudios;
	}

	public void setIdEstudios(Integer idEstudios) {
		this.idEstudios = idEstudios;
	}

	public Integer getCodigoGlymsEstudio() {
		return this.codigoGlymsEstudio;
	}

	public void setCodigoGlymsEstudio(Integer codigoGlymsEstudio) {
		this.codigoGlymsEstudio = codigoGlymsEstudio;
	}

	public String getNombreEstudios() {
		return this.nombreEstudios;
	}

	public void setNombreEstudios(String nombreEstudios) {
		this.nombreEstudios = nombreEstudios;
	}

	public Boolean getSe_realiza_estudio() {
		return this.se_realiza_estudio;
	}

	public void setSe_realiza_estudio(Boolean se_realiza_estudio) {
		this.se_realiza_estudio = se_realiza_estudio;
	}

	public String getSucursales() {
		return this.sucursales;
	}

	public void setSucursales(String sucursales) {
		this.sucursales = sucursales;
	}

}