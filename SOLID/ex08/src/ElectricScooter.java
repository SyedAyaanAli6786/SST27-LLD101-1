public class ElectricScooter implements EnginePowered, Rechargeable {
    @Override
    public void startEngine() {
        System.out.println("Electric scooter engine started!");
    }

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharging scooter with " + kWh + " kWh.");
    }
}
