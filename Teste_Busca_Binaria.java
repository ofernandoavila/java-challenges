
public class Teste_Busca_Binaria {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		numeros[0] = 2;
		numeros[1] = 5;
		numeros[2] = 8;
		numeros[3] = 12;
		numeros[4] = 16;
		numeros[5] = 23;
		numeros[6] = 38;
		numeros[7] = 56;
		numeros[8] = 72;
		numeros[9] = 91;
		
		numeros = BubbleSort.bubble(numeros);
		
		System.out.println(Busca.busca_binaria_recursiva(numeros, 23, 0, numeros.length - 1));
		System.out.println(Busca.busca_binaria_iterativa(numeros, 23));

	}

}
