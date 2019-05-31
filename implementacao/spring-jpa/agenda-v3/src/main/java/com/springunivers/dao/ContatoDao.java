package com.springunivers.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springunivers.model.Cidade;
import com.springunivers.model.Contato;

@Repository
public class ContatoDao {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void inserirContato(Contato contato) {
		em.persist(contato);
	}

	@Transactional
	public void inserirCidade(Cidade cidade) {
		em.persist(cidade);
	}

	public Cidade buscarCidade(Integer id) {
		Cidade cidade = em.find(Cidade.class, id);
		return cidade;
	}

}
