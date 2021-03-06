package com.springunivers.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "v5_contato")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String sobrenome;
	
	@Column(length = 2, nullable = false)
	private Integer ddd;
	
	@Column(length = 9, nullable = false)
	private Long numero;
	
	@Column(length = 50, nullable = false)
	private String cidade;
	
	@Column(length = 2, nullable = false)
	private String estado;

	@OneToMany(fetch = FetchType.EAGER)
	private List<Contato> amigos;

	public void add(Contato amigo) {
		if (amigos == null)
			amigos = new ArrayList<Contato>();
		amigos.add(amigo);
	}

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

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
		return "Contato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", ddd=" + ddd + ", numero="
				+ numero + ", cidade=" + cidade + ", estado=" + estado + "]";
	}

	public List<Contato> getAmigos() {
		return amigos;
	}

}
