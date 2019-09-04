
public class Teste_Fibonacci {

	public static void main(String[] args) {
		int[] termos = new int[15];
		
		
		Fibonacci fb = new Fibonacci(termos);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(fb.get_enesimo_iterativo(i));
		}
		
		System.out.println("\n\n\n");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(fb.get_enesimo_recursivo(i));
		}
	}

}
