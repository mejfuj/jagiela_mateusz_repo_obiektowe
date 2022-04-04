import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Text implements Interface {
    @Override
    public String tekst(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = sc.next();
        
        ArrayList<Character> list = new ArrayList();
        list.addAll(new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y')));

        System.out.println("==========\nPodany tekst od tyłu: ");
        for(int i = tekst.length() - 1; i >= 0;i--) System.out.print(tekst.charAt(i));

        System.out.println("\n==========\nSamogloski");
        for(int i=0; i < tekst.length(); i++) if(list.contains(tekst.charAt(i)))  System.out.print(tekst.charAt(i)+", ");

        System.out.println("\n==========\nSpółgłoski");
        for(int i=0; i < tekst.length(); i++) if(!list.contains(tekst.charAt(i)))  System.out.print(tekst.charAt(i)+", ");
        return tekst;
    }
}
