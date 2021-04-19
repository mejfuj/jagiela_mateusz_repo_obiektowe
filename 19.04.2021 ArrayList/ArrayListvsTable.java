import java.util.ArrayList;

public class ArrayListvsTable {
    public static void ArrayListvsTable(String[] args){
        int[] t = new int[10];
        //Do ArrayList mozna wpisywac tylko obiekty
        //int to typ zmiennej
        ArrayList<Integer> lista = new ArrayList<>();
        //zapelnienie tablicy liczbami od 10 do 19
        for(int i=0;i<10;i++){
            t[i] = i+10;
        }
        System.out.println(t);
        //dodanie do listy elementy - liczby od 10 do 19
        for(int i=0;i<10;i++){
            lista.add(i);
        }
        System.out.println(lista);
        //wynik: [10, 11....19]
        lista.add(100);
        for(int i=0;i<lista.size();i++){
            System.out.println("Lista["+i+"] = "+lista.get(i));
        }
    }
}
