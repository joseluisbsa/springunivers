package com.springunivers.model.map2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "v4_map2_contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 50, nullable = false)
	private String sobrenome;

	// @OneToMany()
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "contato")
	private List<Telefone> telefones;

	@ManyToOne
	@JoinColumn(name = "v4_cid_id")
	private Cidade cidade;

	@Embedded
	private Log log;

	public void addTelefone(Telefone telefone) {
		if (telefones == null)
			telefones = new ArrayList<Telefone>();

		telefone.setContato(this);

		telefones.add(telefone);
	}

	public List<Telefone> getTelefones() {
		return telefones;
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@PrePersist
	private void prePersist() {
		System.out.println("chamando o pre persist");
		log = new Log();
		log.setDataInclusao(new Date());
	}

	@PreUpdate
	private void preUpdate() {
		System.out.println("chamando o pre update");
		log.setDataAlteracao(new Date());
	}

	public Log getLog() {
		return log;
	}

}
