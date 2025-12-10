package OOP;

class Main{
    static class Car{ // class for creating an Object
        String model;
        String color;
        int year;

        Car(){ // here we are assigning values in the constructor itself
            this.model = "camry";
            this.color = "Red";
            this.year = 2019;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("the color of myCar is:" + myCar.color);
    }
}