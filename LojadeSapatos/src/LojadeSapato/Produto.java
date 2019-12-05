package LojadeSapato;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {
	String funcionalidade;
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
		try {
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
		}catch(InputMismatchException exception) {
			System.out.println("Entrada Inválida !\n"+"Por favor refaça operação");
			this.codigo = -1;
		}
		verificarletras(this.modelo);
	}
	
	public void verificarletras(String letras) {
		for (int i = 0; i < letras.length(); i++) {
	          if (Character.isDigit(letras.charAt(i))==true){
	              System.out.println("Entrada Inválida! Possui número(s) em modelo");
	              this.codigo = -1;
	              break;
	          }
	        }
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
		try {
		this.codigo = codigo;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public int getEstoqueminimo() {
		return estoqueminimo;
	}
	public void setEstoqueminimo(int estoqueminimo) {
		try {
		this.estoqueminimo = estoqueminimo;
		}
		catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public int getQuantidadeatual() {
		return quantidadeatual;
	}
	public void setQuantidadeatual(int quantidadeatual) {
		try {
		this.quantidadeatual = quantidadeatual;
		}
		catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public double getCustodeentrada() {
		return custodeentrada;
	}
	public void setCustodeentrada(double custodeentrada) {
		try {
		this.custodeentrada = custodeentrada;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public void setCustodesaida(double custodesaida) {
		try {
		this.custodesaida = custodesaida;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public Double getCustodesaida() {
		return custodesaida;		
	}
	public int getEstoquemaximo() {
		return estoquemaximo;
	}
	public void setEstoquemaximo(int estoquemaximo) {
		try {
		this.estoquemaximo = estoquemaximo;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public int getUnidadesvendidas() {
		return unidadesvendidas;
	}
	public void setUnidadesvendidas(int unidadesvendidas) {
		try{
		this.unidadesvendidas = unidadesvendidas;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
	public double getVendasmensal() {
		return vendasmensal;
	}
	public void setVendasmensal(double vendasmensal) {
		try {
		this.vendasmensal = vendasmensal;
		}catch(InputMismatchException exception) {
			System.out.println("Operação Inválida !");
		}
	}
}
