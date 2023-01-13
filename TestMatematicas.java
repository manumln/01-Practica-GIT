import java.util.Scanner;
public class TestMatematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		boolean esPar = Matematicas.esPar(numero);
		if (esPar)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	

		boolean esDivisiblePorTres = Matematicas.esDivisiblePorTres(numero);
		if (esDivisiblePorTres)
			System.out.println("El número es divisible entre tres");
		else
			System.out.println("El número no es divisible entre tres");
	

		boolean esDivisiblePorCinco = Matematicas.esDivisiblePorCinco(numero);
		if (esDivisiblePorCinco)
			System.out.println("El número es divisible entre cinco");
		else
			System.out.println("El número no es divisible entre cinco");
	}
}
