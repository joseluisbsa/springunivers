package com.springunivers.model.heranca.joined;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "v2_h4_fornecedor")
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
