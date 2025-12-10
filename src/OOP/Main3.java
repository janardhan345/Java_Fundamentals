package OOP;

public class Main3 {
    static class Formula{ // static class , accessible without an object instance
        static double calculateSpeed(double distance, double time){
            return distance/time;
        }
    }

    static void main() {
        System.out.println(Formula.calculateSpeed(165.00,15.00));
    }
}
