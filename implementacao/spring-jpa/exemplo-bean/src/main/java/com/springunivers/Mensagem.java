package com.springunivers;

public class Mensagem {

	static int instancia = 0;

	public Mensagem() {
		instancia++;
	}

	public void enviar() {
		System.out.println("OLA PESSOAL " + instancia);
	}
}
