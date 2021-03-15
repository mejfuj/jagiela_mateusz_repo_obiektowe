import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class mj_zad{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - kwadrat\n2 - prostokat\n3 - Wyłącz program\n-----------\nWybierz opcje: ");
		int mj_a = sc.nextInt();

		if(mj_a==1){
			System.out.println("Podaj szerokosc");
				int szerokosc = sc.nextInt();
			System.out.println("podaj wysokosc");
				int wysokosc = sc.nextInt();
				
				for(int i = 0; i < szerokosc; i++){

					for(int j = 0; j < wysokosc; j++){
						System.out.print("*");
					}
					System.out.println();
				}
			System.out.print("Podaj bok kwadratu: ");
			int mj_kwadrat = sc.nextInt();
			try {
				File fw = new File("mj_kwadrat.txt");
				Scanner sc2 = new Scanner(fw);
				while (sc2.hasNextLine()){
					String mj_wczyt_kwadrat = sc2.nextLine();
					System.out.println(mj_wczyt_kwadrat);
					}
					sc.close();
				}catch(FileNotFoundException e){
					System.out.println("Nie znaleziono pliku: "+e.toString());
				}
				System.out.println("Obwod kwadratu: "+(mj_kwadrat*4));
				System.out.println("Pole kwadratu: "+(mj_kwadrat*2));

		}else if(mj_a==2){
			System.out.println("podaj szerokosc");
				int szerokosc2 = sc.nextInt();
			System.out.println("podaj wysokosc");
				int wysokosc2 = sc.nextInt();

				for(int i = 0; i < szerokosc2; i++){

					for(int j = 0; j < wysokosc2; j++){
						System.out.print("*");
					}
					System.out.println();
				}
			System.out.print("Podaj pierwszy bok prostokata: ");
			int mj_prost = sc.nextInt();
			System.out.print("Podaj drugi bok prostokata: ");
			int mj_prost2 = sc.nextInt();
			try {
				File fw = new File("mj_prostokat.txt");
				Scanner sc3 = new Scanner(fw);
				while (sc3.hasNextLine()){
					String mj_wczyt_prostokat = sc3.nextLine();
					System.out.println(mj_wczyt_prostokat);
					}
					sc.close();
				}catch(FileNotFoundException e){
					System.out.println("Plik nie zostal znaleziony: "+e.toString());
				}
				System.out.println("Obwod prostokata: "+(mj_prost*2+mj_prost2*2));
				System.out.println("Pole prostokata: "+(mj_prost*mj_prost2));
		}else if(mj_a==3){
			System.out.println("Wyłącz program");
			System.exit(0);
		}
	}
}