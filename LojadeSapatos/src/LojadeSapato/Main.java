package LojadeSapato;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	static String funcionalidades;
	private static Loja loja = new Loja();
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Acessar Conta || Criar Usuário");
		funcionalidades = teclado.nextLine();
		while(funcionalidades.equalsIgnoreCase("Fechar") != true) {
			if(funcionalidades.equalsIgnoreCase("Acessar conta")) {
				if(loja.acessarconta()!= null) {
					operaçoes();
				}
			}
			if(funcionalidades.equalsIgnoreCase("Criar Usuario")) {
				Funcionario novofuncionario = new Funcionario();
				operaçoes();
			}
			System.out.println("Acessar Conta || Criar Usuário || Fechar");
			funcionalidades = teclado.nextLine();
		}		
	}
	
	public static void operaçoes() {
		System.out.println("Entrada de Produto || Saida de Produto || Consulta Produto || Realizar Venda || Relatório || Alterar Dados");
		funcionalidades = teclado.nextLine();
		if(funcionalidades.equalsIgnoreCase("Entrada de Produto")) {
			System.out.println("Novo || Existente");
			funcionalidades = teclado.nextLine();
			if(funcionalidades.equalsIgnoreCase("Novo")) {
				Produto novoproduto = new Produto();
				loja.produtos.add(novoproduto);
			}
			else if(funcionalidades.equalsIgnoreCase("Existente")) {
				if(loja.buscaproduto() != null) {
					
				}
				
			}
		}
		else if(funcionalidades.equalsIgnoreCase("Alterar Dados")) {
			System.out.println("Grupo || Modelo || Identificaçao || Marca || Localizaçao || Custo de Entrada || Custo de Saida || Quantidade Atual || Estoque Minimo");
			funcionalidades = teclado.nextLine();
			if(funcionalidades.equalsIgnoreCase("Grupo")) {
				loja.buscaproduto().setGrupo(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Modelo")) {
				loja.buscaproduto().setModelo(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Identificaçao")) {
				loja.buscaproduto().setGrupo(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Marca")) {
				loja.buscaproduto().setMarca(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Localizaçao")) {
				loja.buscaproduto().setLocalizaçao(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Custo de Entrada")) {
				loja.buscaproduto().setCustodeentrada(teclado.nextDouble());
			}
			else if(funcionalidades.equalsIgnoreCase("Custo de Saida")) {
				loja.buscaproduto().setCustodesaida(teclado.nextDouble());
			}
			else if(funcionalidades.equalsIgnoreCase("Quantidade Atual")) {
				loja.buscaproduto().setGrupo(teclado.nextLine());
			}
			else if(funcionalidades.equalsIgnoreCase("Estoque Minimo")) {
				loja.buscaproduto().setGrupo(teclado.nextLine());
			}
		}
		
		else if(funcionalidades.equalsIgnoreCase("Relatorio")) {
			
		}
	}

}
