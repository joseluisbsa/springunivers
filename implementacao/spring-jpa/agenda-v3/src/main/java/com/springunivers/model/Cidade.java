package com.springunivers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="v3_cidade")
public class Cidade {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(length=50,nullable=false)
	private String cidade;
	@Column(length=2,nullable=false)
	private String estado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
}
//sao paulo 3550308
