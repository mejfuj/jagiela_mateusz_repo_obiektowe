class MojeBmi{
    private int wzrost = 0;
    private int waga = 0;
    
    //KONSTRUKTOR
    public MojeBmi(int wzrost, int waga){
        System.out.println("W konstruktorze "+wzrost+" "+waga);
        this.wzrost = wzrost; //this - odwoluje sie do atrybutow OBIEKTU
        this.waga = waga;
    }
    //metoda zwracajaca BMI jako liczbe zmiennoprzecinkowa
    public double mojeBmi(){
        return waga/((double)wzrost/100*(double)wzrost/100);
    }
    
    //METODY pobierajace dane z pol wzrost i waga, oraz zmieniajace wartosci tych pol
    //sa to tak zwane GETTERY i SETTERY
    
    //Zmiana wartosci atrybutow obiektu
    public void setWzrost(int wzrost){
        this.wzrost = wzrost;
    }
    
    public void setWaga(int waga){
        this.waga = waga;
    }
    
    //pobieranie atrybutow obiektu
    public int getWzrost(){
        return wzrost;
    }
    public int getWaga(){
        return waga;
    }
}