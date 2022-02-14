package auta;

public class Truck implements CarImp{
    private boolean lightFlag;

    @Override
    public boolean isLight(){
        return lightFlag;
    }

    @Override
    public void startEngine(){
        System.out.println("Truck has the engine running");
    }

    @Override
    public void stopEngine(){
        System.out.println("Truck has the engine off");
    }
}
