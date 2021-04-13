public class Trojkat {
    public Trojkat(int wysokosc, int podstawa){
        System.out.println("Pole trojkata " + (wysokosc*podstawa/2));
    }

    public Trojkat(int wysokosc){
        System.out.println("Pole trojkata rownobocznego: " + (wysokosc*Math.pow(2,3))/2);
    }
}
