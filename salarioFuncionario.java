import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//		decimais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero funcionario");
		int numeroFuncionario = sc.nextInt();
		
		System.out.println("Horas funcionario");
		double horasTrabalhadas = sc.nextInt();
		
		System.out.println("Valor por hora");
		double valorHora = sc.nextInt();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("numero do funcionaro: " + numeroFuncionario);
		System.out.printf("Salario do funcionario: %.2f", salario);		
		
		sc.close();
	}

}
