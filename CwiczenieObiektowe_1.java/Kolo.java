class Kolo{
    private double pi = 3.1415;
    private double promien = 0;

    public double pole(){
        return pi*Math.pow(promien, 2);
    }

    public double obwod(){
        return 2*pi*promien;
    }

    public void pPromien(double promien){
        this.promien = promien;
    }
}