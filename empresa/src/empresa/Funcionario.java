package empresa;

public class Funcionario {

	public String nome;
	public int idade;
	public double[] salarios;

	public void dadosFuncionario() {
		System.out.println("----------");
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
		if (salarios == null) {
			return;
		}
		for (double salario : salarios) {
			System.out.printf("Salário: %.2f \n", salario);
		}
         mediaSalario();
	}

	private void mediaSalario() {
		if (salarios == null) {
			return;
		}
		double media = 0;

		for (double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;

		System.out.printf("A média dos salários é: R$ %.2f \n", media);
	}

}
