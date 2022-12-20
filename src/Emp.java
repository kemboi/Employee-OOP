public abstract class Emp {
    private final String empName;
    private final int minSalary;

    public String getEmpName() {
        return empName;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public Emp(String empName, int minSalary) {
        this.empName = empName;
        this.minSalary = minSalary;
    }


    // return empName and MinSalary
    public void displayInfo(){
        System.out.println( getEmpName()+" "+getMinSalary());

    }
    // returns minimum Salary
    public abstract double earnings();
}
