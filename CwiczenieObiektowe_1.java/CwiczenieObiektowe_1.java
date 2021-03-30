public class CwiczenieObiektowe_1 {
    public static void main(String[] args){
        MojeDane md = new MojeDane("Mateusz", "Jagiela", "2PTN");
        System.out.println("Imie: "+md.imie
            +"\nNazwisko: "+md.nazwisko
            +"\nKlasa: "+md.klasa);

        Logowanie loguj = new Logowanie();
        System.out.println("\n"+loguj.toString());

        Kolo k1obiekt = new Kolo();
        k1obiekt.pPromien(4);
        System.out.println("Pole: "+k1obiekt.pole()
            +"\nObwod: "+k1obiekt.obwod());

        Kolo k2obiekt = new Kolo();
        k2obiekt.pPromien(20);
        System.out.println("Pole: "+k2obiekt.pole()
            +"\nObwod: "+k2obiekt.obwod());

        Kwadrat kw = new Kwadrat(2);
        System.out.println("\nKwadrat"
            +"\nPole kwadratu: "+kw.poleKw()
            +"\nObwod kwadratu: "+kw.obwKw());
    }
}
