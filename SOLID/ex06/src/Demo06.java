public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();

        Flyable sparrow = new Sparrow("Jack");
        aviary.release(sparrow);

        Penguin penguin = new Penguin("Pingu");
        penguin.swim();
    }
}
