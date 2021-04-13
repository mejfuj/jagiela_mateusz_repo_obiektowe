public class Trojkat {
    public Trojkat(int wysokosc, int podstawa){
        System.out.println("Pole trojkata " + (wysokosc*podstawa/2));
    }

    public Trojkat(int a){ //(Math.pow(a, 2)*Math.pow(a, 1/3))/4 
        System.out.println("Pole trojkata rownobocznego: " + (a*Math.pow(2,3))/2);
    }
}
