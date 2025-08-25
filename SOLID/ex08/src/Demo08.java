public class Demo08 {
    public static void main(String[] args) {
        PedalPowered bicycle = new Bicycle();
        bicycle.pedal(10);

        EnginePowered car = new Car();
        car.startEngine();

        ElectricScooter scooter = new ElectricScooter();
        scooter.startEngine();
        scooter.recharge(5);
    }
}