package Ejercicio5LaVenganza;

import java.util.Scanner;


public class Cuenta {
	Scanner entrada = new Scanner(System.in);
	public int numeroCuenta;
	public int dni;
	public int saldoActual;
	public int saldo = 1000;
	public int interes;
	public int saldoIngresado;

	public Cuenta() {
	}

	public Cuenta(int numeroCuenta, int dni, int saldoActual, int saldo, int interes) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldoActual = saldoActual;
		this.saldo = saldo;
		this.interes = interes;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public void mostrarDatos() {
		System.out.println("Ingrese su numero de DNI");
		int dni = entrada.nextInt();
		System.out.println("Ingrese su numero de cuenta");
		int numeroCuenta = entrada.nextInt();
		System.out.println("Su DNI es: " + dni);
		System.out.println("su número de cuenta es: " + numeroCuenta);
	}

	public int ingresar() {
		System.out.println("Ingrese el monto a depositar");
		int saldoIngresado = entrada.nextInt();
		return saldoActual = saldo + saldoIngresado;
		System.out.println("El saldo actual es: " + saldoActual);
	}

	public int retirar() {
		System.out.println("Ingrese el monto a retirar");
		int saldoIngresado = entrada.nextInt();
		return saldoActual = saldo - saldoIngresado;
		System.out.println("El saldo actual es: " + saldoActual);
	}


	public int extraccionRapida(int saldoIngresado, int saldo, int saldoActual) {
		System.out.println("Ingrese el monto a retirar");
		int saldoIngresado = entrada.nextInt();
		return saldoActual = saldoIngresado * 0.2;
		System.out.println("La extraccion es: " + saldoActual);
		;

	}

	public void consultarCuenta() {
		System.out.println("Ingrese DNI");
		int dni = entrada.nextInt();
		System.out.println(saldoActual);
		System.out.println("123456");
	}

	public void consultarDatos() {
		System.out.println("Ingrese DNI");
		int dni = entrada.nextInt();
		System.out.println(saldoActual);
	}

}

