package OOP;

class Main2 {
    static class Car{ // class for creating an Object
        String model;
        String color;
        int year;

        Car(String model, String color, int year){ // here we are passing the parameters in the constructor
            this.model = model;
            this.color = color;
            this.year = year;
        }
        void turnEngineOn(){
            System.out.println("The engine is on");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Corolla", "Blue", 2022); // the values are assigned the user here
        System.out.println("the color of myCar is:" + myCar.color);
        myCar.turnEngineOn();
    }
}