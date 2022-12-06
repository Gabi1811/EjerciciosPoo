package Tarea3011;

import java.util.Scanner;

public class Rectangulosegungabi {
	Scanner entrada = new Scanner(System.in);

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
		System.out.println("Ingrese  la base del rectangulo");
		int base = entrada.nextInt();
		System.out.println("Ingrese la altura del rectangulo");
		int altura = entrada.nextInt();
	}

	public resultadoArea() {
	   return area = base*altura;
		System.out.println("El area del rectangulo es " + area);
   }
}
