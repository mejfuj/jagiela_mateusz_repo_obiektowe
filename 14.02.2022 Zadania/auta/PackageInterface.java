package auta;

import java.util.Random;

public class PackageInterface {
    public static void main(String[] args){
        CarImp carImp;

        Car car = new Car();
        Truck truck = new Truck();

        car.startEngine();
        truck.startEngine();

        //polimorfizm
        Random r = new Random();
        int nr = r.nextInt(3);
        if(nr==0){
            carImp = new Car();
        }else if(nr==1){
            carImp = new Truck();
        }else{
            carImp = new ElectricCar();
        }

        // carImp = new Car();
        // carImp.startEngine();
        // carImp = new Truck();
        carImp.startEngine();
    }
}
