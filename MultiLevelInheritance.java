class Vehicle 
{
    String brand="tesla";
    void start() 
    {
        System.out.println("brand of the vehical is:"+brand);
    }
}

class Car extends Vehicle 
{
    int speed=120;
    void accelerate() 
    {
        System.out.println(brand + " car is accelerating at " + speed + " km/h");
    }
}

class ElectricCar extends Car 
{
    int batteryLevel=85;
    void charge() 
    {
        System.out.println(brand + " electric car is charging. Battery level: " + batteryLevel + "%");
    }
}
class MultiLevelInheritance 
{
    public static void main(String[] args) 
    {
        ElectricCar e = new ElectricCar();
        e.start();
        e.accelerate();
        e.charge();
    }
}