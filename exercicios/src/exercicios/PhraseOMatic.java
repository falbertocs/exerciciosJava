package exercicios;

public class PhraseOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crite tr�s conjuntos de palavras onde ser� feira a sele��o. Adicione o que quiser
		
		String[] wordListOne = {"24/7", "varias camadas", "30.000 p�s", "B-to-B","todos ganham","front-end", "baseado na Web", "difundido", "inteligente", "seis sigma", "caminho critico", "dinamico"};
		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado","central","distribuido", "agrupado", "solidificado", "independente da m�quina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
		String[] wordListThree = {"processo", "ponto maximo", "solu��o", "arquitetura","habilita��o no nucle","estrat�gia", "mindshare", "portal", "espa�o", "vis�o", "paradigma", "miss�o"};
		
		// descubra quantas palavras existem em cada lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// gere tr�s n�meros aleat�rios
		int rand1 = (int)(Math.random()* oneLength);
		int rand2 = (int)(Math.random()* twoLength);
		int rand3 = (int)(Math.random()* threeLength);
		
		// Construa uma frase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// exiba a frase
		System.out.println("precisamos de " + phrase);

	}

}
