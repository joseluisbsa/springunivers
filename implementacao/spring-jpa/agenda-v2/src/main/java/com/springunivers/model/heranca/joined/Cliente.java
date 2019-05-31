package com.springunivers.model.heranca.joined;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "v2_h4_cliente")
public class Cliente extends Contato {
	
	// @Temporal(TemporalType.DATE)
	@Temporal(TemporalType.TIMESTAMP)
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
