package LojadeSapato;

import java.util.Scanner;

public class Funcionario {
	Scanner teclado = new Scanner(System.in);
	private String nome;
	private String login;
	private String senha;
	public Funcionario() {
		System.out.println("Nome:");
		this.nome = teclado.nextLine();
		System.out.println("Login:");
		this.login = teclado.nextLine();
		System.out.println("senha:");
		this.senha = teclado.nextLine();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
