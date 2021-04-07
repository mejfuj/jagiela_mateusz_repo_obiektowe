class Dane{
    private String imie = "";
    private String nazwisko = "";
    private String dataUr = "";

    public Dane(String imie, String nazwisko, String dataUr){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUr = dataUr;
    }

    @Override
    public String toString(){
        return imie+" "+nazwisko+" urodzil sie "+dataUr;
    }
}