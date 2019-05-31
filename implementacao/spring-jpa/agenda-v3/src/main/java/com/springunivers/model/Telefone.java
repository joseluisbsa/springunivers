package com.springunivers.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {
	
	@Column(length = 2, nullable = false)
	private Integer ddd;
	
	@Column(length = 9, nullable = false)
	private Long numero;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

}
