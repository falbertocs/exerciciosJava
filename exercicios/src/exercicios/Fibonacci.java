package exercicios;
/*
 * imprima	os	primeiros	números	da	série	de	Fibonacci	até	passar	de	100.	
 * A	série	de Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	
 * Para	calculá-la,	o	primeiro	elemento	vale	0,	o segundo	vale	1,	daí	por	diante,	
 * o	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)ésimo	elemento	
 * (ex:	8	=	5	+	3).
 */

public class Fibonacci {
	public static void main (String[]args) {
		int num1 = 1, num2 = 0, num3;
		for (int contador = 0; contador <= 100; contador++) {
			System.out.println(num1);
			num3 = num1;
			num1 = num1 + num2;
			num2 = num3;
			
		}
			
	}

}
