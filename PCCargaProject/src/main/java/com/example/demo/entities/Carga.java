package com.example.demo.entities;
// Generated 11-jul-2019 22:05:43 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Carga generated by hbm2java
 */
@Entity
@Table(name = "carga", catalog = "cargabd")
public class Carga implements java.io.Serializable {

	private int idcarga;
	private Docente docente;
	private Semestreacademico semestreacademico;
	private short horas;

	public Carga() {
	}

	public Carga(int idcarga, Docente docente, Semestreacademico semestreacademico, short horas) {
		this.idcarga = idcarga;
		this.docente = docente;
		this.semestreacademico = semestreacademico;
		this.horas = horas;
	}

	@Id

	@Column(name = "idcarga", unique = true, nullable = false)
	public int getIdcarga() {
		return this.idcarga;
	}

	public void setIdcarga(int idcarga) {
		this.idcarga = idcarga;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddocente", nullable = false)
	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciclo", nullable = false)
	public Semestreacademico getSemestreacademico() {
		return this.semestreacademico;
	}

	public void setSemestreacademico(Semestreacademico semestreacademico) {
		this.semestreacademico = semestreacademico;
	}

	@Column(name = "horas", nullable = false)
	public short getHoras() {
		return this.horas;
	}

	public void setHoras(short horas) {
		this.horas = horas;
	}

}
