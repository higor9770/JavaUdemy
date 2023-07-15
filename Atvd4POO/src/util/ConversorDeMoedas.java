package util;

public class ConversorDeMoedas {
	
	
	public static double IOF = 0.06;
	
	
	public static double dolarParaReal(double quantia, double PrecoDolar) {
		
		return quantia * PrecoDolar * (1.0 + IOF);
	}
}
