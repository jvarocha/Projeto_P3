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
		produtos.remove(buscarproduto());
	}
	
	public Produto buscarproduto() {
		System.out.println("Digite o Código do Produto:");
		int identificaçao = teclado.nextInt();
		for(Produto procurar : produtos) {
			
			if(procurar.getCodigo() == identificaçao) {
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
	
	public void aumentarestoque(Produto produto) {
		if(produto != null) {
			System.out.println("Quantidade Atual: "+produto.getQuantidadeatual()+"\nLimite Máximo: "+produto.getEstoquemaximo());
			System.out.println("Deseja adicionar quantos pares:");
			int acrescimo = teclado.nextInt();
			if(acrescimo + produto.getQuantidadeatual() > produto.getEstoquemaximo()) {
				System.out.println("Esse valor excedi o limite máximo !");
			}
			else {
				produto.setQuantidadeatual(acrescimo + produto.getQuantidadeatual());				
			}
		}
	}
	
	public void relatorio(){
		for(Produto produto: produtos) {
			
				System.out.println("\nCódigo: " + produto.getCodigo() +
								"\nMarca: " + produto.getMarca() +	
								"\nModelo: " + produto.getModelo() +
								"\nEstoque Mínimo: " + produto.getEstoqueminimo() +
								"\nEstoque Máximo: " + produto.getEstoquemaximo() +
								"\nEstoque Atual: " + produto.getQuantidadeatual() +
								"\nCompras: Mensal:" + produto.getCustodeentrada() +
								"\nValor de Venda: " + produto.getCustodesaida() +
								"\nUnidades Vendidas: " + produto.getUnidadesvendidas() +
								"\nVendas Mensal: " + produto.getVendasmensal());
			}
	}
	
	public void realizarvenda(Produto produto) {
		if(produto != null) {
			System.out.println("Unidades:");
			int unidadesvendidas = teclado.nextInt();
			if(produto.getQuantidadeatual()-unidadesvendidas >= 0) {
				produto.setVendasmensal(produto.getCustodesaida()*unidadesvendidas);
				produto.setQuantidadeatual(produto.getQuantidadeatual()-unidadesvendidas);
				produto.setUnidadesvendidas(produto.getUnidadesvendidas()+unidadesvendidas);
			}
			else {
				System.out.println("Não há estoque suficiente !");
			}
		}
	}
	
	public void alterardados(Produto produto) {
		System.out.println("Modelo || Identificaçao || Marca || Localizaçao || Custo de Entrada || Custo de Saida || Quantidade Atual || Estoque Minimo || Estoque Maximo || Voltar");
		funcionalidades = teclado.nextLine();
		if(funcionalidades.equalsIgnoreCase("Modelo")) {
			System.out.println("Para:");
			produto.setModelo(teclado.nextLine());
		}
		else if(funcionalidades.equalsIgnoreCase("Identificaçao")) {
			System.out.println("Para:");
			produto.setCodigo(teclado.nextInt());
		}
		else if(funcionalidades.equalsIgnoreCase("Marca")) {
			System.out.println("Para:");
			produto.setMarca(teclado.nextLine());
		}
		else if(funcionalidades.equalsIgnoreCase("Localizaçao")) {
			System.out.println("Para:");
			produto.setLocalizaçao(teclado.nextLine());
		}
		else if(funcionalidades.equalsIgnoreCase("Custo de Entrada")) {
			System.out.println("Para:");
			produto.setCustodeentrada(teclado.nextDouble());
		}
		else if(funcionalidades.equalsIgnoreCase("Custo de Saida")) {
			System.out.println("Para:");
			produto.setCustodesaida(teclado.nextDouble());
		}
		else if(funcionalidades.equalsIgnoreCase("Quantidade Atual")) {
			System.out.println("Para:");
			aumentarestoque(produto);
		}
		else if(funcionalidades.equalsIgnoreCase("Estoque Minimo")) {
			System.out.println("Para:");
			produto.setEstoqueminimo(teclado.nextInt());
		}
		else if(funcionalidades.equalsIgnoreCase("Estoque Maximo")) {
			System.out.println("Para:");
			produto.setEstoquemaximo(teclado.nextInt());
		}	
	}
	
	public void produtoperdido(Produto produto) {
		if(produto != null) {
			System.out.println("Unidades:");
			int unidadesperdidas = teclado.nextInt();
			if(produto.getQuantidadeatual()-unidadesperdidas >= 0) {
				produto.setQuantidadeatual(produto.getQuantidadeatual()-unidadesperdidas);
				produto.setVendasmensal(-(unidadesperdidas*produto.getCustodesaida()));
			}
			else {
				System.out.println("Houve algum erro!");
			}
		}
	}
} 
