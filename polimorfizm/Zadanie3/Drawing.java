import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Drawing implements Interface {
    @Override
    public String liczba(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe zakresu: ");
        int l1 = sc.nextInt();
        System.out.println("Podaj ostatnia liczbe zakresu: ");
        int l2 = sc.nextInt();
        System.out.println("Czy liczby mogą sie powtarzać (t/n)");
        String wybor = sc.next().toLowerCase();
        System.out.println("Ile liczb chcesz wylosowac?: ");
        int ilosc = sc.nextInt();
        ArrayList<Integer> list = new ArrayList();
        switch(wybor){
            case "t":
                for(int i = 0; i < ilosc; i++) System.out.println(rand.nextInt(l2-l1)+l1);
            case "n":
            if(l2-l1 >= ilosc){
                for(int i = l1; i <= l2; i++) list.add(i);
                for(int i = 0; i < ilosc; i++){
                    int wynik = rand.nextInt(list.size()-1);
                    System.out.println(list.get(wynik));
                    list.remove(wynik); 
                }
            }else{
                System.out.println("W zakresie "+l1+"-"+l2+" nie znajduje sie "+ilosc+" liczb");
            }
                
        }
        return wybor;
    }
}
