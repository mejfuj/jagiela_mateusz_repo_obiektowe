import java.util.ArrayList;
import java.util.Random;

public class Tablica implements Interface {
    @Override
    public int[] tab(){
        Random rand = new Random();
        int[] tab = new int[5];
        for(int i = 0; i < tab.length; i++){
            tab[i] = rand.nextInt(100);
            System.out.print(tab[i]+", ");
        }
        return tab;
    }
    @Override
    public ArrayList<Integer> list(){
        return null;
    }
}
