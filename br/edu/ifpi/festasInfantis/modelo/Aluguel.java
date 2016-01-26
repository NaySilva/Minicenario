package br.edu.ifpi.festasInfantis.modelo;

public class Aluguel {
	
	private Cliente cliente;
	private String endereco;
	private Tema tema;
	private String data;
	private String horaInicial;
	private String horaFinal;
	
	
	
	public Aluguel(Cliente cliente, String endereco, Tema tema, String data, String horaInicial, String horaFinal) {
		this.cliente = cliente;
		this.endereco = endereco;
		this.tema = tema;
		this.data = data;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
	}



	public void desconto(double valor){
		this.tema.setValorDoAluguel(this.tema.getValorDoAluguel() - valor);
	}



	@Override
	public String toString() {
		return "Controle \n\n" + cliente + "Endereco " + endereco + "\n" + tema + "\nData - " + data
				+ "\nHorario Inicial  - " + horaInicial + "\nHorario Final - " + horaFinal + "\n";
	}
	
	

}
