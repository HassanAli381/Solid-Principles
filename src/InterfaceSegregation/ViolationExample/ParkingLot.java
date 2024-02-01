package InterfaceSegregation.BadExample;

import InterfaceSegregation.Car;

public interface ParkingLot {
    void parkCar(); // Decreases empty spot by 1
    void unparkCar(); // Increases empty spot by 1
    int getCapacity(); // Returns car's capacity
    double calculateFee(Car car); // Returns price based on number of hours
    void doPayment(Car car);
}
