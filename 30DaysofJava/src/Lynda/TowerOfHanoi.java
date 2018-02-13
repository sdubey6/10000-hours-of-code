package Lynda;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(3, 'A', 'C', 'B');
		

	}

	public void move(int numberOfdiscs, char from, char to, char inter) {
		if(numberOfdiscs ==1) {
			System.out.println("Moving disc 1 from "+ from + " to"+ to);
			
		} else {
			
		move(numberOfdiscs-1, from, inter, to);
		System.out.println("Moving Disc "+ numberOfdiscs+" from" + from + "to "+to);
		move(numberOfdiscs-1, inter, to, from);
		}
	}
}
