public class HourlyEmp extends Emp {
    private final int hours;
    private final double rate;

    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public HourlyEmp(String empName, int minSalary, int hours, double rate) {
        super(empName, minSalary);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double earnings() {
        double product = hours * rate;
        return Math.max(getMinSalary(), product);
    }

    @Override
    // displays name, hours,rate, earnings()
    public void displayInfo() {
        System.out.println(getEmpName() + " " + getHours() + " " + getRate() + " " + earnings());
    }

}
