package com.springunivers.model.map1;

public enum TelefoneTipo {
	F("FIXO"), //0-
	C("CELULAR");
	private String nome;
	private TelefoneTipo(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
}
