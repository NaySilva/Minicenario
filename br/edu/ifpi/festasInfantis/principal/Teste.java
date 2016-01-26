package br.edu.ifpi.festasInfantis.principal;

import br.edu.ifpi.festasInfantis.modelo.Cliente;
import br.edu.ifpi.festasInfantis.modelo.Aluguel;
import br.edu.ifpi.festasInfantis.modelo.Tema;

public class Teste {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Maria", "98745632");
		
		Tema t1 = new Tema("Princesas", 500.0, "Rosa");
		t1.addItens("Castelo");
		t1.addItens("Tiara");
		t1.addItens("Carroagem");
		
		Aluguel aluguel = new Aluguel(cl1, "Rua A", t1, "22/02", "17:00","20:00");
		
		aluguel.desconto(50.00);
		
		System.out.println(aluguel);

	}

}
