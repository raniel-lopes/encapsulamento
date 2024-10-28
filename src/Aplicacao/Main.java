package Aplicacao;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		//Definindo um nome válido
		funcionario.setNome("Julio Alberto");
		System.out.println("Nome do Funcionário: " + funcionario.getNome());
		
		///Definindo um salário válido
		funcionario.setSalario(3500.0);
		System.out.println("Salário do Funcionário: " + funcionario.getSalario());
		
		//Tentando definir um nome inválido
		System.out.println("\nTentando definir um nome inválido...");
		funcionario.setNome("Ju");
		
		//Tentando definir um salário inválido
		System.out.println("\nTentando definir um salário inválido...");
		funcionario.setSalario(-1);
		
	}

}
