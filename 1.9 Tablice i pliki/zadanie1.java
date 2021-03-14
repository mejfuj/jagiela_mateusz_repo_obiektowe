import java.util.Random;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class zadanie1{
	public static void main(String[] args){
		try{
			Scanner s = new Scanner(new File("uczniowie.TXT"));
			int[] tab = new int[10];
			Random los = new Random();
				for(int i=0; i<10; i++) {
					tab[i] = los.nextInt(6)+1;
				}
					String [] gosciu = new String[10];
					for(int i=0; i<10; i++){
						System.out.println(gosciu[0]=s.nextLine()+" "+tab[i]);
					}
		}catch(FileNotFoundException e){
			System.out.println("Błąd: "+e.toString());
		}
	}
}