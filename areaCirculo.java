import java.util.Scanner;

public class areaCirculo {
	
	public static void main(String[] args) {
	
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
	
	double pi = 3.14159;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor: ");	
	double raio = sc.nextDouble();
	
	double area = ((raio * raio)* pi);	
	System.out.printf("Valor =%.4f", area);
	
	sc.close();
	}
	
}
