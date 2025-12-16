package OOP;
// Inheritance
public class Inheritance_4 {
    static class Toyota extends AccessModifier_2.Car {
        public Toyota(String model, String color, int year){
            super(model, color, year);
        }
    }

    static void main() {
        Toyota myToyota = new Toyota("Yaris", "Black", 2014);
        System.out.println(myToyota.model);
    }
}
