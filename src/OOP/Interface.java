package OOP;

public class Interface {
    interface ElectricCar{ //creating an interface
        void activateSelfDriving(); // an abstract method without code implementation
        int BATTERY_CAPACITY = 310; // interface property rules: UPPER_SNAKE_CASE , value assigned immediately & can't be modified
    }
    static class Tesla implements ElectricCar { // interface Electric car gets implemented only for Tesla
        public void activateSelfDriving() {
            System.out.println("self driving on");
        }
    }

    static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.activateSelfDriving();
    }
}
