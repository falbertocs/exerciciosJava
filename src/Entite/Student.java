package Entite;

public class Student {
	public String nomeDoAluno;
	public double notaPrimeiroTri;
	public double notaSegundoTri;
	public double notaTerceiroTri;
	
	public double calculoNotaPassou() {
		return notaPrimeiroTri + notaSegundoTri + notaTerceiroTri;
	}
	public double calculoNotaReprovou() {
		return 60 - (notaPrimeiroTri + notaSegundoTri + notaTerceiroTri);
	}

}
