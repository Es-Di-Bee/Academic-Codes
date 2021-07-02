public class Car {
        private String make = "";
        private String model = "";
        public Car() {
        }
        public Car(String c) {
                this.make = c;
        }
        public Car(String c, String m) {
                this.make = c;
                this.model = m;
        }
        public void start() {
                if (this.make.equals("Mercedes-Benz") && this.model.equals("SLR McLaren 999")) {
                        System.out.println("Car make: Mercedes-Benz, model: SLR McLaren 999 is starting");
                } else if (this.make.equals("Alfa Romeo")) {
                        System.out.println("Car make: Alfa Romeo is starting");
                } else {
                        System.out.println("Car is starting");
                }
        } 
}

