public class BusinessCar {
    private final String make;
    private final String model;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    private final String year;

    public BusinessCar(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println(getModel() + " " + getMake() + " " + getYear());
    }
}
