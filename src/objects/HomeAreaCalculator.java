package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(); //instance ( Default constructor )
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30,75); // second instance instantiated using custom constructor
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Total Area :" + totalArea);



    }
}
