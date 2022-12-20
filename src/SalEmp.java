public class SalEmp extends Emp {
    private final int monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public SalEmp(String empName, int minSalary, int monthlySalary) {
        super(empName, minSalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    // displays name, monthlySalary, earnings()
    public void displayInfo() {
        System.out.println(getEmpName() + " " + getMonthlySalary() + " " + earnings());
    }

    //  returns the greater of minSalary and monthlySalary
    @Override
    public double earnings() {
        return Math.max(monthlySalary, getMinSalary());
    }

}
