package br.edu.ifpi.festasInfantis.modelo;


public class Tema {

	private String descricao;
	private double valorDoAluguel;
	private String cor;
	private String[] itens;
	int qtd = 0;

	public Tema(String descricao, double valorDoAluguel, String cor) {
		this.descricao = descricao;
		this.valorDoAluguel = valorDoAluguel;
		this.cor = cor;
		this.itens = new String[10];
	}

	public void addItens(String it){
		if (qtd == 10){
			System.out.println("Lista de itens cheia");
			return;
		}
		itens[qtd++] = it;
	}
	
	public double getValorDoAluguel() {
		return valorDoAluguel;
	}

	public void setValorDoAluguel(double valorDoAluguel) {
		this.valorDoAluguel = valorDoAluguel;
	}

	@Override
	public String toString() {
		String str = "Tema " + descricao + ", valorDoAluguel R$ " + valorDoAluguel + ", cor da mesa " + cor + "\nItens: \n";
		for (String item : itens) {
			if (item != null){
				str += item + "\n";
			}
		}
		return str;
	}
	
	

}
