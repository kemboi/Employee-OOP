public class CommEmp extends Emp {
    private final double rate;
    private final int sales;

    public double getRate() {
        return rate;
    }

    public double getSales() {
        return sales;
    }

    public CommEmp(String empName, int minSalary, double rate, int sales) {
        super(empName, minSalary);
        if(rate<0.0)
            throw new IllegalArgumentException("Rate cannot be negative");
        this.rate = rate;
        this.sales = sales;
    }


    @Override
    public double earnings() {
        double product = sales * rate;
        return Math.max(getMinSalary(), product);
    }

    @Override
    // displays name, sales, rate , earnings()
    public void displayInfo() {
        System.out.println(getEmpName() + " " + sales + " " + rate + " " + earnings());
    }
}
