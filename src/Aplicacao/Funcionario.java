package Aplicacao;

public class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && nome.length() >= 3) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido! O nome deve ter pelo menos 3 caracteres.");
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario >= 0) {
		this.salario = salario;
		} else {
			System.out.println("Salário inválido! O valor deve ser positivo.");
		}
		
	}

}
