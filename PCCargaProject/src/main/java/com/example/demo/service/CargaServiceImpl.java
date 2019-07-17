package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CargaAcademicaDao;
import com.example.demo.entities.Carga;

@Service

public class CargaServiceImpl implements CargaService{
	@Autowired
	private CargaAcademicaDao cargaAcademicaDao;

	@Override
	@Transactional
	public List<Carga> listarCarga() {
		// TODO Auto-generated method stub
		return cargaAcademicaDao.listarCarga();
	}
	
	

}
