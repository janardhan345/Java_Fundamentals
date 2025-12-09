package objects;

import java.util.Scanner;

// sending and receiving objects
public class HomeAreaCalculatorRedo {
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateArea(room1,room2);
        System.out.println("Total Area :" + totalArea);
    }
    public Rectangle getRoom(){
        System.out.println("Enter the lenght:");
        double length = sc.nextDouble();
        System.out.println("Enter the width:");
        double width = sc.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
