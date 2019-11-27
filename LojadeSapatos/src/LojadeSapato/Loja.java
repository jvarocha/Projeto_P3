package LojadeSapato;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	ArrayList<Produto> produtos = new ArrayList<>();
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	Scanner teclado = new Scanner(System.in);
	String funcionalidades;
	public void entradaproduto() {
		Produto novoproduto = new Produto();
		produtos.add(novoproduto);
	}
	
	public void saidaproduto() {
		produtos.remove(buscaproduto());
	}
	
	public void consutarprodutor() {
		System.out.println(buscaproduto().getIdentificaçao());
	}
	
	public Produto buscaproduto() {
		System.out.println("Digite o identificação do Produto:");
		int identificaçao = teclado.nextInt();
		for(Produto procurar : produtos) {
			if(procurar.getIdentificaçao() == identificaçao) {
				return procurar;
			}
		}
		return null;
	}
	
	public Funcionario buscafuncionario() {
		System.out.println("Digite o Nome:");
		String nome = teclado.nextLine();
		for(Funcionario procurar : funcionarios) {
			if(procurar.getNome() == nome) {
				return procurar;
			}
		}
		return null;
	}
	
	public Funcionario acessarconta() {
		System.out.println("Login:");
		String login = teclado.nextLine();
		for(Funcionario procurar : funcionarios) {
			if(procurar.getLogin().equals(login)) {
				System.out.println("Senha:");
				String senha = teclado.nextLine();
				if(procurar.getSenha().equals(senha)) {
					return procurar;
				}
			}
		}
		return null;
	}
	
	public void aumentarestoque() {
		
	}
	
	public void relatorio(){
		System.out.println("Geral ou Individual");
		funcionalidades = teclado.nextLine();
		if(funcionalidades.equalsIgnoreCase("Geral")) {
			
		}
		else if(funcionalidades.equalsIgnoreCase("Individual")) {
			
		}
	}
	
}
