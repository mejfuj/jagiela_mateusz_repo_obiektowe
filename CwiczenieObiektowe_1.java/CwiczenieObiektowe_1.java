public class CwiczenieObiektowe_1 {
    public static void main(String[] args){
        MojeDane md = new MojeDane("Mateusz", "Jagiela", "2PTN");
        System.out.println("Imie: "+md.imie+"\nNazwisko: "+md.nazwisko+"\nKlasa: "+md.klasa);

        Logowanie loguj = new Logowanie();
        System.out.println("\n"+loguj.toString());
    }
}
