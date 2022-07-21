import java.util.Scanner;

public class calculoPeças {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Codigo peça 1: ");
		double codPeça1 = sc.nextDouble();
		System.out.println("Numero de peças: ");
		int numeroPeça1 = sc.nextInt();
		System.out.println("Valor de cada: ");
		double valorPeça1 = sc.nextDouble();
		
		System.out.println("Codigo peça 2: ");
		double codPeça2 = sc.nextDouble();
		System.out.println("Numero de peças: ");
		int numeroPeça2 = sc.nextInt();
		System.out.println("Valor de cada: ");
		double valorPeça2 = sc.nextDouble();	
		
		double total = (valorPeça1 * numeroPeça1) + (valorPeça2 * numeroPeça2);
		
		System.out.println("VALOR A PAGAR :" + total );
		
		
		sc.close();
	}

}
