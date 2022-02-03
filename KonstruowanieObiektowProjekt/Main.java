import java.util.*;
import java.lang.Math;

class Main {

    public static void main(String argv[]) {

		Scanner stdin = new Scanner(System.in);

		Random generator = new Random();

		int score, computerscore;
	
		System.out.println("Witaj w grze BlackJack.");
	
		score = playPlayer(stdin, generator);
		System.out.println("Twoj koncowy wynik = " + score);

		computerscore = playComputer(generator);
		System.out.println("Wynik bota [Komputer] = " + computerscore);

		printWinner(score, computerscore);
    }

    public static int playPlayer(Scanner stdin, Random r) {

		boolean hit = true;
		int numcards = 0; 
		int score = 0;

		while (hit) {

	    	int singlecard = 0; 

	    	while (numcards < 2 || singlecard < 1) {

				int rand = Math.abs(r.nextInt())%13;

				if (rand == 0) {
		    		score = score + getAce(stdin);
				}

				else if (rand < 10) {
		    		System.out.println("Wartość karty = " + (rand + 1));
		    		score = score + rand + 1;
				}
				else {
		    		System.out.println("Wartość karty = 10");
		    		score = score + 10;
				}

				numcards++;
				singlecard++;
	    	}	

	    	System.out.println("Twoj aktualny wynik = " + score);
	    	if (score <= 21) {
	    		
				System.out.println("[Jesli chcesz dobrać wpisz Y, jak nie to wpisz cokolwiek.]");
				char ans = (stdin.next()).charAt(0);
		
				if (ans != 'y' && ans != 'Y')
		    		hit = false;
	    	}
	    	else
				hit = false;
		}	

		return score;

    }

    public static int playComputer(Random r) {

        int computerscore = 0;

		while (computerscore < 17) {

	    	int rand = Math.abs(r.nextInt())%13;
	    	int cardvalue;

	    	if (rand == 0) {
		
				if (computerscore < 11) 
		    		cardvalue = 11;
				else 
		    		cardvalue = 1;
	    	}
	    	else if (rand < 10) 
				cardvalue = rand + 1;
	    	else 
				cardvalue = 10;

	    	computerscore = computerscore + cardvalue;
	    	System.out.println("Wynik bota [Komputer] = " + cardvalue);
		}

		return computerscore;
    }

    public static void printWinner(int playerscore, int computerscore) {

		if (playerscore > 21 && computerscore > 21)
	    	System.out.println("Nikt nie wygrał.");
		else if (playerscore > 21)
	    	System.out.println("Przgrałeś, BOT wygrał.");
		else if (computerscore > 21)
	    	System.out.println("BOT przegrał, wygrałeś domyślnie.");
		else {
	    
	    	if (playerscore > computerscore)
				System.out.println("Wygrałeś.");
	    	
		}	

    }

    public static int getAce(Scanner stdin) {

  		System.out.println("[Zdobyłeś asa, liczyć jako 1 czy 11?.]");
		int acescore = stdin.nextInt();
	
		while (acescore != 11 && acescore != 1) {

        	System.out.println("[Nieprawidłowa wartość, wpisz 1 lub 11.]");	
           	acescore = stdin.nextInt();
		}

		return acescore;
    }

}