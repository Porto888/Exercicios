package PraticandoSobrecarga;

public class CalculadoraGeometrica {

	public static void area(double lado) {

		System.out.println("�rea do quadrado �: " + lado * lado);
	}

	public static void area(double ladoA, double ladoB) {

		System.out.println("�rea do ret�ngulo �: " + ladoA * ladoB);
	}

	public static void area(double B, double b, double h) {

		System.out.println("�rea do trap�zio �: " + ((B + b) * h) / 2);
	}

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("�rea do losango �: " + (diagonal1 * diagonal2) / 2);
	}

}

