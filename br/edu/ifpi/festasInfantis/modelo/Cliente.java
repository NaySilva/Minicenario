package br.edu.ifpi.festasInfantis.modelo;

public class Cliente {
	
	private String nome;
	private String telefone;
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String toString() {
		return "Cliente " + nome + ", telefone " + telefone + "\n";
	}
	
	

}
