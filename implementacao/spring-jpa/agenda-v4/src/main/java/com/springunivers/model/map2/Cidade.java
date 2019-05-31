package com.springunivers.model.map2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v4_map2_cidade")
public class Cidade {
	
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 2, nullable = false)
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", estado=" + estado + "]";
	}

}
