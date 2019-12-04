package LojadeSapato;

import java.util.Scanner;

public class Produto {
	Scanner teclado = new Scanner(System.in);
	private int codigo;
	private String marca;
	private String modelo;
	private String localizaçao;
	private double custodeentrada;
	private double custodesaida;
	private int quantidadeatual;
	private int estoqueminimo;
	private int estoquemaximo;
	private int unidadesvendidas;
	private double vendasmensal;	
	public Produto() {
		System.out.println("Marca:");
		this.marca = teclado.nextLine();
		System.out.println("Modelo:");
		this.modelo = teclado.nextLine();
		System.out.println("Localização(Pratileira):");
		this.localizaçao = teclado.nextLine();
		System.out.println("Custo de Entrada:");
		this.custodeentrada = teclado.nextDouble();
		System.out.println("Custo de venda (individual):");
		this.custodesaida = teclado.nextDouble();
		System.out.println("Unidades:");
		this.quantidadeatual = teclado.nextInt();
		System.out.println("Código:");
		this.codigo = teclado.nextInt();
		System.out.println("Estoque Mínimo:");
		this.estoqueminimo = teclado.nextInt();
		System.out.println("Estoque Máximo:");
		this.estoquemaximo = teclado.nextInt();
	}
	public void MostrarDados() {
		System.out.println( "\nCodigo: " + this.codigo +
				   "\nMarca: " + this.marca +
				   "\nModelo: " + this.modelo +
				   "\nPratileira: " + this.localizaçao +
				   "\nPreço: " + this.custodesaida +
					"\nUnidades: " + this.quantidadeatual);
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
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public Double getCustodesaida() {
		return custodesaida;		
	}
	public int getEstoquemaximo() {
		return estoquemaximo;
	}
	public void setEstoquemaximo(int estoquemaximo) {
		this.estoquemaximo = estoquemaximo;
	}
	public int getUnidadesvendidas() {
		return unidadesvendidas;
	}
	public void setUnidadesvendidas(int unidadesvendidas) {
		this.unidadesvendidas = unidadesvendidas;
	}
	public double getVendasmensal() {
		return vendasmensal;
	}
	public void setVendasmensal(double vendasmensal) {
		this.vendasmensal = vendasmensal;
	}
}
