public class exc3 {
    public enum Shapes {
        CIRCLE,
        SQUARE,
        SLINDER,
        HEXAGON
    }

    public static void main(String[] args) {
        Shapes shape1 = Shapes.CIRCLE;
        Shapes shape2 = Shapes.SLINDER;

        System.out.println(shape1);
        System.out.println(shape2);
    }
}
