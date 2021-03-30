class Kolo{
    private double pi = 3.1415;
    private double radius = 0;

    public double pole(){
        return pi*Math.pow(radius, 2);
    }

    public double obwod(){
        return 2*pi*radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}