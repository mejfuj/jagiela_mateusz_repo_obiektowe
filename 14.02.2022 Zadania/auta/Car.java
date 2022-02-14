package auta;

public class Car implements CarImp{
    private boolean lightFlag;

    @Override
    public boolean isLight(){
        return lightFlag;
    }

    @Override
    public void startEngine(){
        System.out.println("Car has the engine running");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car has the engine off");
    }
}