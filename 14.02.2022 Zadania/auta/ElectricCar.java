package auta;

public class ElectricCar implements CarImp{
    
    private boolean lightFlag;

    @Override
    public boolean isLight(){
        return lightFlag;
    }

    @Override
    public void startEngine(){
        System.out.println("Electric Car has the engine running");
    }

    @Override
    public void stopEngine(){
        System.out.println("Electric Car has the engine off");
    }

}
