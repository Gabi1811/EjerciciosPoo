package Tarea3011;

import java.util.Scanner;
public class Rectangulo {
	private int base;
	private int altura;
	int area;

	public Rectangulo() {

	};




	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void calcularArea() {
		Scanner entrada = new Scanner(System.in).useDelimiter("\n");

	System.out.println ("Ingrese  la base del rectangulo");
	this.setBase(entrada.nextInt());
	System.out.println("Ingrese la altura del rectangulo");
	this.setAltura(entrada.nextInt());
	}

public void resultadoArea() {
	int area = this.base * this.altura;
		System.out.println("El area del rectangulo es " + area);

	}

}
