package com.springunivers.dao;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springunivers.model.heranca.joined.*;

@Repository
public class ContatoDao {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void buscarOuInserirContato(Integer id) {
		Contato contato = em.find(Contato.class, id);
		if (contato == null) {
			contato = new Cliente();
			contato.setNome("GLEYSON");
			contato.setSobrenome("SAMPAIO");
			contato.setDdd(11);
			contato.setNumero(978786514L);
			contato.setEstado("SP");
			contato.setCidade("SAO PAULO");
			em.persist(contato);
		} else {
			System.out.println(contato.getId() + " " + contato.getNome() + " " + contato.getSobrenome());
		}
	}

	@Transactional
	public void atualizarUltimaVisitaCliente(Integer id) {
		Cliente contato = em.find(Cliente.class, id);
		if (contato != null) {
			contato.setUltimaCompra(new Date());
			contato.setValor(100.d);
			System.out.println(
					"Ultima compra foi: " + DateFormat.getDateTimeInstance().format(contato.getUltimaCompra()));
		}

	}
}
