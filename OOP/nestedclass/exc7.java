package nestedclass;

class House {
    private int width, length;

    public House(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void calculateArea() {
        // Local class Room
        class Room {
            public int getArea() {
                return width * length;
            }
        }

        Room room = new Room(); // Local classdan obyekt
        System.out.println("Uy maydoni: " + room.getArea());
    }
}

public class exc7 {
    public static void main(String[] args) {
        House house = new House(12, 15);
        house.calculateArea();
    }
}
