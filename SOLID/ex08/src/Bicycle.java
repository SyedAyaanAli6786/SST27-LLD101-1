public class Bicycle implements PedalPowered {
    @Override
    public void pedal(int effort) {
        System.out.println("Pedaling with effort: " + effort);
    }
}
