package FixandoMetodos;

public class MainMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Executando calculadora");
		System.out.println(" ");

		Calculadora.soma(3700, 3700);
		Calculadora.subtracao(-2, -2);
		Calculadora.multiplica��o(1500, 365);
		Calculadora.divisao(5480, 45);

		System.out.println(" ");

		System.out.println("Os metodos abaixo retornam a mensagen, de acordo com o hor�rio informado");

		Mensagem.obterMensagem(10);

		System.out.println(" ");

		System.out.println("Execu��o do m�todo emprestimo");
		System.out.println(" ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(6000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(5000, 10);

	}

}
