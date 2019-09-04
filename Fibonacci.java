
public class Fibonacci {
	
	private int[] termos = new int[0];
	private int tamanho;
	
	public Fibonacci(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Fibonacci(int[] termos) {
		for(int i = 0; i < termos.length; i++) {
			termos[i] = get_termo(i);
		}
		
		this.termos = termos;
	}
	
	public static int get_termo(int number) {
		if(number <= 2) {
			return 1;
		} else if( number == 0) {
			return 0;
		} else {
		
			return get_termo(number - 1) + get_termo(number - 2);
		}
	}
	
	public int get_enesimo_iterativo(int termo_busca) {
		int[] termos = new int[termo_busca];
		int termo = 0;
		
		if(termo_busca != 0) {
			for(int i = 0; i < termos.length; i++) {
				if(i == 0) {
					termos[i] = 0;
				}
				if(termos.length <= 2) {
					termo = 1;
				} else {
					termos[i] = get_termo(termo_busca - 1) + get_termo(termo_busca - 2);
					
					if(i == termos.length - 1) {
						termo = termos[termo_busca - 1];
					}					
				}
			}
			
		} else {
			termo = 0;
		}
			
		return termo;
	}
	
	public int get_enesimo_recursivo(int termo) {
		
		if( termo == 0) {
			return 0;
		} 
		
		if(termo <= 2) {
			return 1;
		} else {
		
			return get_termo(termo - 1) + get_termo(termo - 2);
		}
	}
	
	@Override
	public String toString() {
		String string = "";
		String termos_label = "";
		
		if(this.termos.length != 0) {
			
			if(this.termos.length == 1) {
				string = "Este é o ";
				termos_label = "º termo";
			} else {
				string = "Estes são os ";
				termos_label = " termos";
			}
			string = string + this.termos.length + termos_label + " da sequência: \n";
			for(int i = 0; i < this.termos.length; i++) {
				if(i != (this.termos.length - 1)) {
					string = string + this.termos[i] + ", ";
				} else {
					string = string + this.termos[i] + ".";
				}
			}
		} else {
			if(this.tamanho == 1) {
				string = "Este é o ";
				termos_label = "º número";
			} else {
				string = "Estes são os ";
				termos_label = " números";
			}
			string = string + tamanho + termos_label + " da sequência: \n";
			for(int i = 0; i < tamanho; i++) {
				if(i != (tamanho - 1)) {
					string = string + get_termo(i) + ", ";
				} else {
					string = string + get_termo(i) + ".";
				}
			}
		}
		
		return string;
		
	}
	
	
	
}
