public class Demo05 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(1, 1);
        Shape square = new Square(1);

        System.out.println(ShapeResizer.areaAfterResize(rect));   // 20
        System.out.println(ShapeResizer.areaAfterResize(square)); // 16
    }
}
