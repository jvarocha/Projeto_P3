package LojadeSapato;

import java.util.Scanner;

public class Funcionario {
	Scanner teclado = new Scanner(System.in);
	private String nome;
	private int cpf;
	private String login;
	private String senha;
	public Funcionario() {
		System.out.println("Nome:");
		this.nome = teclado.nextLine();
		System.out.println("Login:");
		this.login = teclado.nextLine();
		System.out.println("Senha:");
		this.senha = teclado.nextLine();
		System.out.println("CPF:");
		this.cpf = teclado.nextInt();
	}
	public void verificarletras(String letras) {
		for (int i = 0; i < letras.length(); i++) {
	          if (Character.isDigit(letras.charAt(i))==true){
	              System.out.println("Entrada Inválida! Possui número(s) em nome");
	              nome = "-1";
	          }
	        }
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
