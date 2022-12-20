public class BpCommEmp extends CommEmp {
    public final int baseSalary;
    public final BusinessCar car;

    public double getBaseSalary() {
        return baseSalary;
    }

    public BpCommEmp(String empName, int sales, double rate, int baseSalary, BusinessCar car) {
        super(empName, sales, rate, baseSalary);

        this.baseSalary = baseSalary;
        this.car = car;
    }

    public BpCommEmp(String empName, int sales, double rate, int baseSalary) {
        super(empName, sales, rate, baseSalary);

        this.baseSalary = baseSalary;

        car = null;
    }


    @Override
    public double earnings() {

        return getSales() * getRate() + getBaseSalary();
    }

    @Override
    // displays name, sales, rate , earnings(),car info
    public void displayInfo() {
        if (car != null) {

            System.out.print(getEmpName() + " " + getSales() + " " + getRate() + " " + earnings()
                    + " ");
            car.displayInfo();

        } else {
            System.out.println(getEmpName() + " " + getSales() + " " + getRate() + " " + earnings());
        }
    }
}
