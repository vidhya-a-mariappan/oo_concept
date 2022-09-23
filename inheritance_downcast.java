class Car extends Vehicle {
    protected int numberOfSeats = 6;

    public int getNumberOfSeats() {
        return this.numberOfSeats;

    }

    public void  printNumberOfSeats() {
       
        System.out.println(numberOfSeats);
    }
}

class Vehicle {
    protected String licensePlate = null;
    public void setLicensePlate(String license){
        this.licensePlate = license;
        System.out.println(licensePlate);
    }

    public static void main(String[] args) {
        Vehicle c = new Vehicle();
        c.setLicensePlate("TN37AC1234");
        Vehicle d = new Car();
        ((Car)d).printNumberOfSeats();//downcasting
    }
    }
