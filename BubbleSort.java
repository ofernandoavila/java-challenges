
public class BubbleSort {

	public static int[] bubble(int[] numeros) {
		
		for(int i = 0; i < numeros.length; i++) {
			for(int atual = 0; atual < numeros.length - 1; atual++) {
				int proximo = atual + 1;
				if(numeros[atual] > numeros[proximo]) {
					int temp = numeros[atual];
					numeros[atual] = numeros[proximo];
					numeros[proximo] = temp;
				}
			}
		}
		
		return numeros;
	}

}
