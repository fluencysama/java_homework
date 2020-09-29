package lesson3;
import java.util.Random;

public class RandomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int a;
		a=rand.nextInt(11)+1;
		
		switch(a) {
		case 1:
		case 2:
		case 3:
			System.out.println("Spring");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Summer");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Autumn");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Winter");
			break;
		}
	}

}
