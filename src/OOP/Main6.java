package OOP;

public class Main6 {
    static class Toyota extends Main5.Car {
        public Toyota(){
            super();
        }
        public void soundHorn(){
            System.out.println("Sounds like a toyota");
        }
    }

    static class Mercedes extends Main5.Car {
        public Mercedes(){
            super();
        }
        public void soundHorn(){
            System.out.println("sounds like a mercedes");
        }
    }

    static void main(String[] args) {
        Toyota myToyota = new Toyota();
        Mercedes myMercedes = new Mercedes();
        myMercedes.soundHorn();
        myToyota.soundHorn();
    }
}
