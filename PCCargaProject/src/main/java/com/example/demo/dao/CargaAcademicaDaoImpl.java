package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Carga;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;
import com.example.demo.entities.Semestreacademico;

@Repository
public class CargaAcademicaDaoImpl implements CargaAcademicaDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Carga> listarCarga() {
		// TODO Auto-generated method stub
		
		return (List<Carga>) entityManager.createQuery("select new Carga(d.nombres as nombres,s.ciclo as ciclo, c.horas as horas) FROM Carga as c " + 
				"inner join Docente as d " + 
				"on c.docente = d.iddocente " + 
				"inner join Semestreacademico s " + 
				"on c.semestreacademico = s.ciclo", Carga.class)
				.getResultList();
				
	}
	

}
