import java.util.Scanner;

public class estruturaSequencial {

	public static void main(String[] args) {

//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//		mensagem explicativa
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");		
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos numeros é : " + soma);
		
		
		
		sc.close();
		
	}

}
