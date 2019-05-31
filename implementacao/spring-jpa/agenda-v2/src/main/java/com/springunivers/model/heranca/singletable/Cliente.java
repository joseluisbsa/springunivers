package com.springunivers.model.heranca.singletable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
// DEIXA DE TER @Table
@DiscriminatorValue("C")
public class Cliente extends Contato {
	
	@Temporal(TemporalType.TIMESTAMP)
	// @Temporal(TemporalType.DATE)
	private Date ultimaCompra;
	
	@Column(length = 7, precision = 2)
	private Double valor;

	public Date getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(Date ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
