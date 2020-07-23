package exercicios;
 
class DrumKit {
	
	boolean playSnare = true;
	boolean playTopHat = true;
	
	void playTopHat() {
		System.out.println("ding ding da ding");
	}
	void playSnare() {
		System.out.println("bang bang ba bang");		
	}
	
}

public class DrumkitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrumKit d = new DrumKit();
		d.playSnare ();
		d.playSnare = false;
		d.playTopHat();
		
		if (d.playSnare == true) {
			d.playSnare();
		}
		

	}

}
