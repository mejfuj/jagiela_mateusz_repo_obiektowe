class ImieNaziwsko{
    private String imie = "";
    private String nazwisko = "";

    public ImieNaziwsko(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void imieNazwisko(){
        return (imie+nazwisko);
    }

    //metoda wyswietlajaca powitanie:
    //witaj imie nazwisko - imie i nazwisko wprowadzone w konstruktorze

}