package exercicios;
/*
 * imprima	os	primeiros	n�meros	da	s�rie	de	Fibonacci	at�	passar	de	100.	
 * A	s�rie	de Fibonacci	�	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	
 * Para	calcul�-la,	o	primeiro	elemento	vale	0,	o segundo	vale	1,	da�	por	diante,	
 * o	n-�simo	elemento	vale	o	(n-1)-�simo	elemento	somado	ao	(n-2)�simo	elemento	
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
