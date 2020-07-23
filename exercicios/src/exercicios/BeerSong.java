package exercicios;

public class BeerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroDaCerveja = 99;
		String word = "Garrafas";
		
		while (numeroDaCerveja > 0) {
			
			if (numeroDaCerveja == 1) {
			word = "Garrafa";
			}
			
		System.out.println(numeroDaCerveja + " " + word  + 	" de cerveja na parede");
		//System.out.println(numeroDaCerveja + " " + word + " de cerveja");
		System.out.println(numeroDaCerveja + " " + word + " Derrube uma");
		//System.out.println(numeroDaCerveja + " " + word + "Passe ao redor");
		numeroDaCerveja = numeroDaCerveja -1;
		
		if (numeroDaCerveja > 0) {
			
			System.out.println(numeroDaCerveja + " " + word + " de cerveja na parede");
					}
		else {
			System.out.println("Não há mais garrafas de cerveja na parede");
				
		}
	}
	
	}
}


/*********************** Em ingles
int beerNum = 99;
String word = "bottles";

while (beerNum > 0) {
	
	if (beerNum == 1) {
	word = "bottle";
	}
	
System.out.println(beerNum + " " + word + " of beer on the wall");
System.out.println(beerNum + " " + word + " of beer");
System.out.println(beerNum + " " + word + "Take one down");
System.out.println(beerNum + " " + word + "Pass it around");
beerNum = beerNum -1;

if (beerNum > 0) {
	
	System.out.println(beerNum + " " + word + " of beer on the wall");
			}
else {
	System.out.println("No more bottles of beer on the wall");
	*/
