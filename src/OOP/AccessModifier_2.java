package OOP;

class AccessModifier_2 {
    static class Car{ // class for creating an Object
        public String model;
        public String color;
        public int year;
        private int vehicleNumber; // a private datatype, as vehicle number is considered sensitive.

        Car(String model, String color, int year){ // here we are passing the parameters in the constructor
            this.model = model;
            this.color = color;
            this.year = year;
        }
        public void turnEngineOn(){ // this is a void method
            System.out.println("The engine is on");
        }
        private void airbagsDeployed(){
            System.out.println("airbags deployed");
        }

        public int calculateMPG(int milesDriven, int gallonsUsed){ // a non-void method that returns an integer ( calculating miles per gallon for fuel consumption )
            return milesDriven/gallonsUsed;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Corolla", "Blue", 2022); // the values are assigned the user here
        System.out.println("the color of myCar is:" + myCar.color);
        myCar.turnEngineOn(); // method being called
        System.out.println(myCar.calculateMPG(180,20));
    }
}