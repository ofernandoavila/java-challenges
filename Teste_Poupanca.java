import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Teste_Poupanca {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.UP);
		System.out.println(df.format(Poupanca.get_rendimento("03/05/2012", 5, 1000000.00, 6.5)));
		
	}

}
