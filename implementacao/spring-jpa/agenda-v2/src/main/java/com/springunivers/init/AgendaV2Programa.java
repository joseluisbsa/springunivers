package com.springunivers.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springunivers.dao.ContatoDao;

@Component
public class AgendaV2Programa {
	
	@Autowired
	private ContatoDao dao;
	private final int ID = 5;

	public void buscarOuInserirContato() {
		dao.buscarOuInserirContato(ID);
	}

	public void atualizarUltimaCompra() {
		dao.atualizarUltimaVisitaCliente(ID);
	}
}
