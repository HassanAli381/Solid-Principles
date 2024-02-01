package InterfaceSegregation.BadExample;

import InterfaceSegregation.Car;

public class FreeParking implements ParkingLot{
    @Override
    public void parkCar() {
        // do car parking logic
    }

    @Override
    public void unparkCar() {
        // do car unparking logic
    }

    @Override
    public int getCapacity() {
        // calculate capacity
        return 0;
    }

    @Override
    public double calculateFee(Car car) {
        System.out.println("Car parking is free");
        // through an exception
        return 0;
    }

    @Override
    public void doPayment(Car car) {
        System.out.println("Car parking is free");
        // through an exception
    }
}
