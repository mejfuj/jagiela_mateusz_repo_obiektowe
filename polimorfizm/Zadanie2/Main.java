import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Interface inter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz co chcesz wyświetlić (Imie/Wzrost)");
        String wybierz = sc.next().toLowerCase();
        switch (wybierz){
            case "wzrost":
                inter = new Height();
                inter.wzrost();
                break;
            case "imie":
                inter = new Name();
                inter.imie();
                break;
            default:
                inter = null;
        }
    }
}