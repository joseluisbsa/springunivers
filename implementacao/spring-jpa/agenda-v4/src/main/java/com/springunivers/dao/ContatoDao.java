package com.springunivers.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springunivers.model.map1.Cidade;
import com.springunivers.model.map1.Contato;

@Repository
public class ContatoDao {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void inserirContato(Contato contato) {
		em.persist(contato);
	}

	@Transactional
	public void alterarContato(Contato contato) {
		em.merge(contato);
	}

	@Transactional
	public void inserirCidade(Cidade cidade) {
		em.persist(cidade);
	}

	public Cidade buscarCidade(Integer id) {
		Cidade cidade = em.find(Cidade.class, id);
		return cidade;
	}

	public Contato buscarContato(Integer id) {
		Contato c = em.find(Contato.class, id);
		return c;
	}

}
