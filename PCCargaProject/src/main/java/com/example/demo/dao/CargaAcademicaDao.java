package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Carga;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;
import com.example.demo.entities.Semestreacademico;

public interface CargaAcademicaDao {

	public List<Docente> listarDocente();
	public List<Carga> listarCarga();
	public List<Curso> listarCurso();
	public List<Semestreacademico> listarSemestreAcademico();
}
