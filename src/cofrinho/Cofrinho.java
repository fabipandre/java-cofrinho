package cofrinho;

import java.util.ArrayList;

import cofrinho.moeda.Moeda;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		// Verifica se o cofrinho possui algum valor antes de remover
		if (listaMoedas.size() == 0) {
			System.out.println("O cofrinho está vazio");
			return;
		}

		listaMoedas.remove(moeda);
	}
	
	public void listagemMoeda() {
		// Verifica se o cofrinho possui algum valor antes de listar seu conteúdo		
		if (listaMoedas.size() == 0) {
			System.out.println("O cofrinho está vazio");
			return;
		}

		for (Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	public void totalConvertido() {	
		double total = 0;  
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		System.out.println("O total convertido para real é " + total);
	}	
	
}
