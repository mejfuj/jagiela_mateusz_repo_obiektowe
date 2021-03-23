class ImieNazwisko{
    private String imie = "";
    private String nazwisko = "";
        
    //KONSTRUKTOR
    public ImieNazwisko(String imie, String nazwisko){
        this.imie = imie; //this - odwoluje sie do atrybutow OBIEKTU
        this.nazwisko = nazwisko;
    }
    
    public String witaj(){
        return ("Witaj "+imie+" "+nazwisko+" - imie wprowadzone w konstruktorze");
    }
}