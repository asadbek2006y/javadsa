public class exc13 {
    public static void main(String[] args) {
        int a,b;
        a = -124;
        b = 12;

        System.out.println("Mod" + (a%b));
        System.out.println("Floor mod: " + Math.floorMod(a, b));
        System.out.println("DIV: " + (a/b));
        System.out.println("Floor Div: " + Math.floorDiv(a, b));
    }
}
