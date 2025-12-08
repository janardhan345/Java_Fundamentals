package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(); //instance ( Default constructor )
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30,75);
        double totalArea = room2.calculateArea();

        System.out.println("Area Of house: " + totalArea);

    }
}
