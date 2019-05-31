package com.springunivers.model.map2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "v4_map2_telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 2, nullable = false)
	private Integer ddd;
	
	@Column(length = 9, nullable = false)
	private Long numero;
	
	@Enumerated(EnumType.ORDINAL) // EnumType.STRING
	private TelefoneTipo tipo;

	@ManyToOne
	@JoinColumn(name = "v4_map2_contato")
	private Contato contato;

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

	public TelefoneTipo getTipo() {
		return tipo;
	}

	public void setTipo(TelefoneTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
