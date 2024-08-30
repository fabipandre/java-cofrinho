package main;

import java.util.Scanner;

import cofrinho.Cofrinho;
import cofrinho.moeda.Dolar;
import cofrinho.moeda.Euro;
import cofrinho.moeda.Moeda;
import cofrinho.moeda.Real;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Principal p = new Principal();
		Cofrinho cofrinho = new Cofrinho();		
		
		Moeda moeda = null;
		int opcao = -1;
		
		// Fica no loop infinito até que o usuário digite a opção para encerrar o programa.
		while(true) {
			// Mostra o menu principal
			p.mostraMenuPrincipal();
			
			// Aguarda o usuário entrar com a opção 
			System.out.print("Entre com a opçao: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1: //ADICIONAR			
				// Mostra o menu para seleção de moeda que retorna um tipo de moeda de acordo com a opção selecionada.
				moeda = p.selecionarMoeda();

				System.out.print("Digite o valor no formato 123.45: ");
				double valor = teclado.nextDouble();
				moeda.setValor(valor);
				
				cofrinho.adicionar(moeda);
				
				System.out.print(valor + " adicionado com sucesso!");
				
				break;

			case 2: //REMOVER
				// Mostra o menu para seleção de moeda que retorna um tipo de moeda de acordo com a opção selecionada.
				moeda = p.selecionarMoeda();
				
				System.out.print("Digite o valor no formato 123.45: ");
				double valorRemover = teclado.nextDouble();
				moeda.setValor(valorRemover);
				
				cofrinho.remover(moeda);	
				
				System.out.print(valorRemover + " removido com sucesso!");
				
				break;

			case 3: //LISTAR
				cofrinho.listagemMoeda();
				break;
				
			case 4: //CALCULAR
				cofrinho.totalConvertido();
				break;
				
			case 0: //ENCERRAR
				System.out.println("Final do programa");
				System.exit(0);
				
			default:
				System.out.println("Opção inválida!. Selecione uma opção do menu");
			}			
		}
	}
	
	private void mostraMenuPrincipal() {
		String menu = "\n\nCOFRINHO:\n" +
				"1-Adicionar Moeda\n" +
				"2-Remover Moeda\n" +
				"3-Listar Moedas\n" +
				"4-Calcular total convertido para Real\n" +
				"0-Encerrar\n";
		System.out.println(menu);
	}
	
	private Moeda selecionarMoeda() {
		int opcaoMoeda = 0;
		Moeda moeda = null;
		
		String menu = "\n1-Real\n" +
				"2-Dolar\n" +
				"3-Euro\n";
		System.out.println(menu);
		
		// Fica no loop até o usuário selecionar uma opção válida de moeda e retorna uma instância da moeda escolhida.
		do {
			System.out.print("Informe a moeda: ");
			opcaoMoeda = teclado.nextInt();	
			
			switch (opcaoMoeda) {
			case 1: 
				moeda = new Real();
				break;
			case 2: 
				moeda = new Dolar();
				break;
			case 3: 
				moeda = new Euro();
				break;
			default:
				System.out.println("Opção inválida! Informe 1, 2 ou 3!");
			}			
		} while (opcaoMoeda < 1 || opcaoMoeda > 3);
		
		return moeda;
		
	}

}
