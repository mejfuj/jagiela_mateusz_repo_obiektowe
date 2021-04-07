public class JagielaMateusz {
    public static void main(String[] args){
        Sprawdzian md = new Sprawdzian("Programowanie Obiektowe");
        System.out.println("Przedmiot: "+md.przedmiot);
        System.out.println("Data: "+md.data);
        System.out.println("Ocena: "+md.ocena);
        
        Dane d = new Dane("Mateusz", "Jagiela", "09.03.2004");
        System.out.println(d.toString()+"\n");

        Tablica tablica1 = new Tablica();
        Tablica tablica2 = new Tablica();

        for(int i=0; i<10; i++){
            if(tablica1.tab[i] > tablica2.tab[i]) System.out.println(tablica1.tab[i]+" > "+tablica2.tab[i]);
            else if(tablica1.tab[i] < tablica2.tab[i]) System.out.println(tablica1.tab[i]+" < "+tablica2.tab[i]);
            else System.out.println(tablica1.tab[i]+" = "+tablica2.tab[i]);
        }
    }
}