
public class Busca {
	
	public static int busca_binaria_iterativa(int[] numeros, int busca) {
		
		int meio, limitante_esquerda = 0, limitante_direita = numeros.length - 1;
		
		while(limitante_esquerda <= limitante_direita) {
			meio = (limitante_esquerda + limitante_direita) / 2; // Define qual é a chave meio do array
			
			System.out.println("Buscando o número " + busca + " entre " + numeros[limitante_esquerda] + " e " + numeros[limitante_direita]);
			
			if(busca == numeros[meio]) {
				return meio; // O número buscado está na posição meio
			} else {
				if(busca > numeros[meio]) {
					limitante_esquerda = meio + 1; // Se o número buscado for maior que o número que está no meio, incrementamos o valor do meio para encontrar o valor
				} else {
					limitante_direita = meio - 1; // Se o número buscado for menor que o número que está no meio, diminuímos o meio para encontrar o valor
				}
			}
		}
		
		return -1;
	}
	
	/**
	 *   
	 * @param numeros array com os números a serem buscados
	 * @param busca	número a ser buscado
	 * @param limitante_esquerda posição mínima do array
	 * @param limitante_direita posição máxima do array
	 * @return posição do array onde se encontra o número
	 */
	
	public static int busca_binaria_recursiva(int[] numeros, int busca, int limitante_esquerda, int limitante_direita) {
				
		int meio = (limitante_esquerda + limitante_direita) / 2; // Define qual é a chave meio do array
		
		System.out.println("Buscando o número " + busca + " entre " + numeros[limitante_esquerda] + " e " + numeros[limitante_direita]);
		
		if(busca == numeros[meio]) {
			return meio; // O número buscado está na posição meio
		}
		
		if(limitante_esquerda >= limitante_direita) { //Caso o número desejado não seja encontrado entre os parâmetros fornecidos, ele irá retornar um valor negativo indicando erro
			return -1;
		} else {
			if(busca > numeros[meio]) {
				meio = meio + 1; // Se o número buscado for maior que o número que está no meio, incrementamos o valor do meio para encontrar o valor
				return busca_binaria_recursiva(numeros, busca, meio, limitante_direita); // Realiza novamente a busca com novos parâmetros
			} else {
				meio = meio - 1; // Se o número buscado for menor que o número que está no meio, diminuímos o meio para encontrar o valor
				return busca_binaria_recursiva(numeros, busca, limitante_esquerda, meio); // Realiza novamente a busca com novos parâmetros
			}
		}
			
				
	}

}
