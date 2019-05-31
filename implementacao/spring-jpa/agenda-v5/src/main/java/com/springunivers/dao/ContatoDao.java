package com.springunivers.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springunivers.model.Contato;

@Repository
public class ContatoDao {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void inserirContato(Contato contato) {
		em.persist(contato);
	}

	public Contato buscarContato(Integer id) {
		return em.find(Contato.class, id);
	}

}
