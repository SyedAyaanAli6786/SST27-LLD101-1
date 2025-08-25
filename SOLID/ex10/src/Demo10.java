public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();  // choose implementation
        ReportService service = new ReportService(logger);
        service.generate();
    }
}
