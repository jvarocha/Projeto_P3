package LojadeSapato;

import java.util.Scanner;

public class Produto {
	Scanner teclado = new Scanner(System.in);
	private String grupo;
	private int identificaçao;
	private String marca;
	private String modelo;
	private String localizaçao;
	private double custodeentrada;
	private double custodesaida;
	private int quantidadeatual;
	private int estoqueminimo;
	private int estoquemaximo;
	public Produto() {
		System.out.println("Grupo:");
		this.grupo = teclado.nextLine();
		System.out.println("Marca:");
		this.marca = teclado.nextLine();
		System.out.println("Modelo:");
		this.modelo = teclado.nextLine();
		System.out.println("Localização:");
		this.localizaçao = teclado.nextLine();
		System.out.println("Custo de Entrada:");
		this.custodeentrada = teclado.nextDouble();
		System.out.println("Custo de Saída:");
		this.custodesaida = teclado.nextDouble();
		System.out.println("Custo de Quantidade:");
		this.quantidadeatual = teclado.nextInt();
		System.out.println("Estoque Mínimo:");
		this.estoqueminimo = teclado.nextInt();
		System.out.println("Estoque Máximo:");
		this.estoquemaximo = teclado.nextInt();
	}
	public void MostrarDados() {
		System.out.println( "\nGrupo:" + this.grupo +
				   "\nIdentificação: " + this.identificaçao +
				   "\nMarca: " + this.marca +
				   "\nModelo:" + this.modelo +
				   "\nLocal:" + this.localizaçao +
				   "\nPreço" + this.custodesaida);
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getLocalizaçao() {
		return localizaçao;
	}
	public void setLocalizaçao(String localizaçao) {
		this.localizaçao = localizaçao;
	}
	
	public int getIdentificaçao() {
		return identificaçao;
	}
	public void setIdentificaçao(int identificaçao) {
		this.identificaçao = identificaçao;
	}
	public int getEstoqueminimo() {
		return estoqueminimo;
	}
	public void setEstoqueminimo(int estoqueminimo) {
		this.estoqueminimo = estoqueminimo;
	}
	public int getQuantidadeatual() {
		return quantidadeatual;
	}
	public void setQuantidadeatual(int quantidadeatual) {
		this.quantidadeatual = quantidadeatual;
	}
	public double getCustodeentrada() {
		return custodeentrada;
	}
	public void setCustodeentrada(double custodeentrada) {
		this.custodeentrada = custodeentrada;
	}
	public void setCustodesaida(double custodesaida) {
		this.custodesaida = custodesaida;		
	}
	public Double setCustodesaida() {
		return custodesaida;		
	}
	public int getEstoquemaximo() {
		return estoquemaximo;
	}
	public void setEstoquemaximo(int estoquemaximo) {
		this.estoquemaximo = estoquemaximo;
	}
}
