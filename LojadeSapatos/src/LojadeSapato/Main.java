package LojadeSapato;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	static String funcionalidades;
	private static Loja loja = new Loja();
	public static void main(String[] args) {		
		System.out.println("Acessar Conta || Criar Usuário");
		funcionalidades = teclado.nextLine();
		while(funcionalidades.equalsIgnoreCase("Fechar") != true) {
			if(funcionalidades.equalsIgnoreCase("Acessar conta")) {
				if(loja.acessarconta()!= null) {
					operaçoes();
				}
			}
			if(funcionalidades.equalsIgnoreCase("Criar Usuario")) {
				loja.funcionarios.add(new Funcionario());
				operaçoes();
			}
			System.out.println("Acessar Conta || Criar Usuário || Fechar");
			funcionalidades = teclado.nextLine();
		}		
	}
	
	public static void operaçoes() {
		while(funcionalidades.equalsIgnoreCase("voltar") != true) {
			
			System.out.println("Entrada de Produto || Perda de Produto || Consultar Produto || Realizar Venda || Relatório || Alterar Dados");
			funcionalidades = teclado.nextLine();
			if(funcionalidades.equalsIgnoreCase("Entrada de Produto")) {
				
				System.out.println("Novo || Existente");
				funcionalidades = teclado.nextLine();
				if(funcionalidades.equalsIgnoreCase("Novo")) {
					loja.entradaproduto();
				}
				else if(funcionalidades.equalsIgnoreCase("Existente")) {
					loja.aumentarestoque(loja.buscarproduto());				
				}
				
			}
			
			else if(funcionalidades.equalsIgnoreCase("Alterar Dados")) {
				loja.alterardados(loja.buscarproduto());
			}
			
			else if(funcionalidades.equalsIgnoreCase("Consultar Produto")) {
				
				Produto consultado = loja.buscarproduto();
				if(consultado != null) {
					consultado.MostrarDados();				
				}
				else {
					System.out.println("Produto não existente.");
				}			
			}
			
			else if(funcionalidades.equalsIgnoreCase("Perda de Produto")) {
				loja.produtoperdido(loja.buscarproduto());
			}
		
			else if(funcionalidades.equalsIgnoreCase("Realizar Venda")) {
				loja.realizarvenda(loja.buscarproduto());
			}
		
			else if(funcionalidades.equalsIgnoreCase("Relatorio")) {
				loja.relatorio();
			}
		}
	}
}
