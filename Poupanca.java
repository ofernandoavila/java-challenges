
public class Poupanca {

	/**
	 * 
	 * Calcula o rendimento após X anos
	 * 
	 * @param data_inicio Formato: "00/00/0000"
	 * @param tempo	Tempo dado em anos
	 * @param valor	#.##
	 * @param taxa_selic #.##
	 * @return double valor
	 */
	public static double get_rendimento(String data_inicio, int tempo, double valor, double taxa_selic) {
		taxa_selic = taxa_selic / 100;
		if(checa_data(data_inicio)) {
			double novoValor = 0;
			for(int i = 0; i < tempo; i++) {
				novoValor = valor + calculo_anual(valor, taxa_selic);
				valor = novoValor;
			}
		} else {
			if(taxa_selic < 8.5) {
				double novoValor = 0;
				for(int i = 0; i < tempo; i++) {
					novoValor = valor + calculo_anual(valor, (taxa_selic * 0.7));
					valor = novoValor;
				}
			} else {
				double novoValor = 0;
				for(int i = 0; i < tempo; i++) {
					novoValor = valor + calculo_anual(valor, taxa_selic);
					valor = novoValor;
				}
			}
		}
		
		return valor;
	}
	
	/**
	 * 
	 * Função auxiliar para ajudar no cálculo do rendimento
	 * 
	 * @param valor
	 * @param multiplicador
	 * @return
	 */
	
	private static double calculo_anual(double valor, double multiplicador) {
		return valor * multiplicador;
	}
	
	
	/**
	 * Checa se o início da aplicação começou antes da nova regra
	 * 
	 * @param data_checar
	 * @return
	 */
	
	private static boolean checa_data(String data_checar) {
		String[] data;
		data = data_checar.split("/");
		
		int[] teste = new int[3];
		
		for(int i = 0; i < data.length; i++) {
			teste[i] = Integer.parseInt(data[i]);
		}
		
		if(teste[2] <= 2012) {
			if(teste[1] <= 5) {
				if (teste[0] < 4) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
