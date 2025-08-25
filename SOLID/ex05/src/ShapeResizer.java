public class ShapeResizer {

    public static int areaAfterResize(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            r.setWidth(5);
            r.setHeight(4);
            return r.area();
        } 
        else if (shape instanceof Square) {
            Square s = (Square) shape;
            s.setSide(4); // resizing square to side=4
            return s.area();
        }
        throw new IllegalArgumentException("Unsupported shape");
    }
}
