package com.springunivers.model.heranca.singletable;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
// DEIXA DE TER @Table
@DiscriminatorValue("F")
public class Fornecedor extends Contato {
	
	@Temporal(TemporalType.DATE)
	private Date ultimaVisita;

	public Date getUltimaVisita() {
		return ultimaVisita;
	}

	public void setUltimaVisita(Date ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}

}
