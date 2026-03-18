class Vehicle {
    String type = "Four Wheeler";   // small t
}

class Car extends Vehicle {
    String model = "Swift";

    void showCar() {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
    }
}

class CarMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.showCar();
    }
}
    