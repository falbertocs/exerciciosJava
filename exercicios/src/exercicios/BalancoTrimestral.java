package exercicios;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastoTrimestre, gastosJaneiro = 15000, gastosFevereiro = 23000, gastoMarco = 17000;
		
		gastoTrimestre = gastosJaneiro + gastosFevereiro + gastoMarco;
		System.out.println(gastoTrimestre);
		
		int mediaMensal = gastoTrimestre / 3;
		
		System.out.println("O valor da média Mensal é: " + mediaMensal);
		
	}

}
