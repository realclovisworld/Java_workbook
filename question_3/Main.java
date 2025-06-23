package question_3;
import java.util.List;
import java.util.ArrayList;


//Abstract parent class
abstract class Vehicle{
    protected double fuelCapacity;

    //constructor
    public Vehicle(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;

    }

    //Abstract method to calculate range
    public abstract double calculateRange();
}
//subclass:car
class Car extends Vehicle{
    public Car(double fuelCapacity){
        super(fuelCapacity);
    }
    @Override
    public double calculateRange(){
        return fuelCapacity*10; //10 units per kilometer

    }
}

//subclass: Truck
class Truck extends Vehicle{
    public Truck(double fuelCapacity){
        super(fuelCapacity);
    }
    @Override
    public double calculateRange(){
        return fuelCapacity*5; //5units per kilometer

    }
}
//subclass: Motorcycle
class Motorcycle extends Vehicle{
    public Motorcycle(double fuelCapacity){
        super(fuelCapacity);
    }
    @Override
    public double calculateRange(){
        return fuelCapacity*15; //15 units per kilometer

    }
}
//Logistics class
class Logistics{
    private List<Vehicle> vehicles;

    //constructor
    public Logistics(){
        this.vehicles = new ArrayList<>();
    }

    //Method to add a vehicle
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    //method to display ranges
    public void displayRanges(){
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.getClass().getSimpleName() + " Range: " + vehicle.calculateRange() + " km");
        }
    }
}
//Main class
public class Main{
    public static void main(String[] args){
        //Create vehicles
        Vehicle car = new Car(50);  //50liters
        Vehicle truck = new Truck(100);   //100liters
        Vehicle motorcycle = new Motorcycle(20);   //20liters

        //Manage vehicles in logistics
        Logistics logistics = new Logistics();
        logistics.addVehicle(car);
        logistics.addVehicle(truck);
        logistics.addVehicle(motorcycle);

        //Display ranges
        logistics.displayRanges();
    }
}

/*
 * Questions 3
You are hired by a logistics company to develop a system to manage different types of vehicles. 
Each vehicle can calculate its maximum range based on its fuel capacity and fuel efficiency. 
The company has three types of vehicles: Car, Truck, and Motorcycle. Each type has unique characteristics for calculating the range.
 * 
 * 
 * 
 * Pseudo code**

1. Define abstract class Vehicle:
    - Attribute: fuelCapacity
    - Constructor to set fuelCapacity
    - Abstract method: calculateRange()

2. Define Car class (inherits Vehicle):
    - Implement calculateRange(): return fuelCapacity * 10

3. Define Truck class (inherits Vehicle):
    - Implement calculateRange(): return fuelCapacity * 5

4. Define Motorcycle class (inherits Vehicle):
    - Implement calculateRange(): return fuelCapacity * 15

5. Define Logistics class:
    - List to store Vehicle objects
    - Constructor to initialize list
    - Method addVehicle(vehicle): add vehicle to list
    - Method displayRanges():
        - For each vehicle in list, print vehicle type and its range

6. In Main:
    - Create Car, Truck, and Motorcycle objects with specific fuel capacities
    - Create Logistics object
    - Add vehicles to logistics
    - Call logistics.displayRanges() to show ranges

 */