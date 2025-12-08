package objects;

public class Rectangle { // class
    double length;
    double width;
    int sides = 4;

    public Rectangle(double length, double width) { // constructor
        setLength(0);
        setWidth(0);
    }

    double calculatePerimeter(){ // method
        return (2*length)+(2*width);
    }
    double calculateArea(){
        return length*width;
    }
    // to get the length and width values, we use getter/setter methods


    public double getLength() { //getter
        return length;
    }

    public void setLength(double length) { //setter
        this.length = length; // setting global var to current parameter
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
