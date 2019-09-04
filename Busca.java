
public class Busca {
	
	public static int busca_binaria_iterativa(int[] numeros, int busca) {
		
		int meio, limitante_esquerda = 0, limitante_direita = numeros.length - 1;
		
		while(limitante_esquerda <= limitante_direita) {
			meio = (limitante_esquerda + limitante_direita) / 2; // Define qual � a chave meio do array
			
			System.out.println("Buscando o n�mero " + busca + " entre " + numeros[limitante_esquerda] + " e " + numeros[limitante_direita]);
			
			if(busca == numeros[meio]) {
				return meio; // O n�mero buscado est� na posi��o meio
			} else {
				if(busca > numeros[meio]) {
					limitante_esquerda = meio + 1; // Se o n�mero buscado for maior que o n�mero que est� no meio, incrementamos o valor do meio para encontrar o valor
				} else {
					limitante_direita = meio - 1; // Se o n�mero buscado for menor que o n�mero que est� no meio, diminu�mos o meio para encontrar o valor
				}
			}
		}
		
		return -1;
	}
	
	/**
	 *   
	 * @param numeros array com os n�meros a serem buscados
	 * @param busca	n�mero a ser buscado
	 * @param limitante_esquerda posi��o m�nima do array
	 * @param limitante_direita posi��o m�xima do array
	 * @return posi��o do array onde se encontra o n�mero
	 */
	
	public static int busca_binaria_recursiva(int[] numeros, int busca, int limitante_esquerda, int limitante_direita) {
				
		int meio = (limitante_esquerda + limitante_direita) / 2; // Define qual � a chave meio do array
		
		System.out.println("Buscando o n�mero " + busca + " entre " + numeros[limitante_esquerda] + " e " + numeros[limitante_direita]);
		
		if(busca == numeros[meio]) {
			return meio; // O n�mero buscado est� na posi��o meio
		}
		
		if(limitante_esquerda >= limitante_direita) { //Caso o n�mero desejado n�o seja encontrado entre os par�metros fornecidos, ele ir� retornar um valor negativo indicando erro
			return -1;
		} else {
			if(busca > numeros[meio]) {
				meio = meio + 1; // Se o n�mero buscado for maior que o n�mero que est� no meio, incrementamos o valor do meio para encontrar o valor
				return busca_binaria_recursiva(numeros, busca, meio, limitante_direita); // Realiza novamente a busca com novos par�metros
			} else {
				meio = meio - 1; // Se o n�mero buscado for menor que o n�mero que est� no meio, diminu�mos o meio para encontrar o valor
				return busca_binaria_recursiva(numeros, busca, limitante_esquerda, meio); // Realiza novamente a busca com novos par�metros
			}
		}
			
				
	}

}
