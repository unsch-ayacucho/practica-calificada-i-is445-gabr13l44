package com.example.demo.entities;
// Generated 04-jul-2019 21:58:16 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso", catalog = "cargabd")
public class Curso implements java.io.Serializable {

	private Integer idCurso;
	private String nombre;
	private byte horasSemanales;
	private String tipo;
	private Set<Docente> docentes = new HashSet<Docente>(0);

	public Curso() {
	}

	public Curso(String nombre, byte horasSemanales, String tipo) {
		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
		this.tipo = tipo;
	}

	public Curso(String nombre, byte horasSemanales, String tipo, Set<Docente> docentes) {
		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
		this.tipo = tipo;
		this.docentes = docentes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCurso", unique = true, nullable = false)
	public Integer getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	@Column(name = "Nombre", nullable = false, length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "HorasSemanales", nullable = false)
	public byte getHorasSemanales() {
		return this.horasSemanales;
	}

	public void setHorasSemanales(byte horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	@Column(name = "tipo", nullable = false, length = 10)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

}