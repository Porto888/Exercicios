package PraticandoSobrecarga;

public class ReturnMain {


	public static void main(String[] args) {
		
		
        // Retornos
        System.out.println("Exerc�cio retornos");

        double areaQuadrado = Return.area(9);
        System.out.println("�rea do quadrado:" + areaQuadrado);

        double areaRetangulo = Return.area(55,25);
        System.out.println("�rea do ret�ngulo:" + areaRetangulo);

        double areaTrapezio = Return.area(9,9,9);
        System.out.println("�rea do trap�zio:" + areaTrapezio);


	}

}
