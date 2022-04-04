import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Interface inter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz gdzie chcesz zapisac (Tablica/Array)");
        String wybierz = sc.next().toLowerCase();
        switch (wybierz){
            case "tablica":
                inter = new Tablica();
                inter.tab();
                break;
            case "array":
                inter = new Lista();
                inter.list();
                break;
            default:
                inter = null;
        }
    }
}