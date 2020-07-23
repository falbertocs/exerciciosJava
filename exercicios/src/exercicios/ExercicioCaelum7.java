package exercicios;

import java.util.Scanner;

/* 7.	(opcional)	Escreva	um	programa	que,	dada	uma	variável		x		com	algum	valor	inteiro,	temos	um novo		x		de	acordo	com	a	seguinte	regra:
se		x		é	par,		x	=	x	/	2	se		x		é	impar,		x	=	3	*	x	+	1	imprime		x	
O	programa	deve	parar	quando		x		tiver	o	valor	final	de	1.	Por	exemplo,	para		x	=	13	,	a	saída será:
40	->	20	->	10	->	5	->	16	->	8	->	4	->	2	->	1
*/

public class ExercicioCaelum7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int x = in.nextInt();
		while (x > 1) {
		y = x % 2;
		if (y == 0) {
			x = x / 2;
			System.out.println(x); 
		}
		else {
			x = 3 * x + 1;
			System.out.println(x);
		}
		

		}

	}
}