import java.util.Random;

class Tablica{
    public int[] tab = new int[10];
    
    public Tablica(){
        Random los = new Random();
        for(int i=0; i<10; i++) tab[i] = los.nextInt(21)-10;
    }
}