class PierwszyKonstruktor{
    public static void main (String[] args){
        
        /*
        MojeBmi mb = new MojeBmi(190,86);
        mb.wzrost = 160;
        mb.waga = 80;
        */
        
        //Zmiana atrybutow obiektu poprzez konstruktor
        //MojeBmi mb = new MojeBmi(190,86);
        //double wynik = mb.mojeBmi();
        //System.out.println("BMI = "+wynik);
        //System.out.println("Pola w obiekcie "+mb.wzrost+" "+mb.waga);
        ImieNazwisko im = new ImieNazwisko("","");
    }
}

class ImieNazwisko{
    private String imie = "";
    private String nazwisko = "";
        
    //KONSTRUKTOR
    public ImieNazwisko(String imie, String nazwisko){
        this.imie = imie; //this - odwoluje sie do atrybutow OBIEKTU
        this.nazwisko = nazwisko;
        System.out.println("Witaj "+imie+" "+nazwisko+" imie wprowadzone w konstruktorze");
    }
}