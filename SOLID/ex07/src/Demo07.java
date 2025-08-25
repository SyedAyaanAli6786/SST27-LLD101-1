public class Demo07 {
    public static void main(String[] args) {
        Printer basic = new BasicPrinter();
        basic.print("Hello from basic printer!");

        System.out.println("----");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("Hello from MFP!");
        mfp.scan("/tmp/out");
        mfp.fax("123-456-7890");
    }
}
