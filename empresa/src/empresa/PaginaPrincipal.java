package empresa;

public class PaginaPrincipal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.idade = 20;
		funcionario.nome = "Vagner Gonçalves";
		funcionario.salarios = new double[] { 1200, 987.35, 2000 };

		Funcionario funcionario02 = new Funcionario();

		funcionario02.nome = "Alberto Souza";
		funcionario02.idade = 35;
		funcionario02.salarios = new double[] { 1500, 1235.15, 2500 };

		funcionario.dadosFuncionario();

		funcionario02.dadosFuncionario();

		System.out.println("----------");

	}

}
