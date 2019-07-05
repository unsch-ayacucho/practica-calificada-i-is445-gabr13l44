package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Carga;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;
import com.example.demo.entities.Semestreacademico;

@Repository("DocenteDao")
public class CargaAcademicaDaoImpl implements CargaAcademicaDao {
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public List<Docente> listarDocente() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select d.Nombres from Docente d").getResultList();
	}

	@Override
	public List<Carga> listarCarga() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select c.Horas from Carga c").getResultList();
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Semestreacademico> listarSemestreAcademico() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select sa.ciclo from SemestreAcademico sa").getResultList();
	}
}
