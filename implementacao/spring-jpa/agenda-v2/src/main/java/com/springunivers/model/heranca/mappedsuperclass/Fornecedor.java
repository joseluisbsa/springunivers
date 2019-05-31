package com.springunivers.model.heranca.mappedsuperclass;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "v2_h1_fornecedor")
public class Fornecedor extends Contato {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ultima_visita")
	private Date ultimaVisita;

	public Date getUltimaVisita() {
		return ultimaVisita;
	}

	public void setUltimaVisita(Date ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}

}
